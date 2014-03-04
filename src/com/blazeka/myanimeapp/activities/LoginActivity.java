package com.blazeka.myanimeapp.activities;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.activeandroid.Model;
import com.activeandroid.query.Select;
import com.blazeka.myanimeapi.MyAnimeAPI;
import com.blazeka.myanimeapi.exceptions.WrongCredentialsException;
import com.blazeka.myanimeapp.R;
import com.blazeka.myanimeapp.data.UserCredentials;
import com.blazeka.myanimeapp.data.Utils;

public class LoginActivity extends Activity {
	
	private UserCredentials credentials;
	
	private EditText usernameBox;
	private EditText passwordBox;
	private CheckBox rememberMeBox;
	
	private static MyAnimeAPI malApi = MyAnimeAPI.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
    	usernameBox = (EditText) findViewById(R.id.username);
    	passwordBox = (EditText) findViewById(R.id.password);
    	rememberMeBox = (CheckBox) findViewById(R.id.rememberMe);
        
        List<Model> credList = new Select().from(UserCredentials.class).execute();
        
        if(credList.size() != 0 && credList != null)
        	credentials = (UserCredentials) credList.get(0);
        else
        	credentials = new UserCredentials();
        
        if(credentials.isRemembered())
        	continueToMainActivity();
        else
        	rememberMeBox.setChecked(false);
    }

    private void continueToMainActivity()
    {
    	try
    	{
			malApi.verifyCredentials(credentials.getUsername(), credentials.getPassword());
			
			startActivity(new Intent(this, MainActivity.class));
		}
    	catch (WrongCredentialsException e)
    	{
			Utils.doShortToast(LoginActivity.this, e.getMessage());
		}
	}

    public void startMainActivity(View v)
    {
		String username = usernameBox.getText().toString();
		String password = passwordBox.getText().toString();
		
		if(rememberMeBox.isChecked())
		{
			credentials.setUsername(username);
			credentials.setPassword(password);
			credentials.setRememberMe(true);
			
			credentials.save();
		}
		
		try
		{
			malApi.verifyCredentials(credentials.getUsername(), credentials.getPassword());
			
			startActivity(new Intent(this, MainActivity.class));
		}
		catch (WrongCredentialsException e)
		{
			Utils.doShortToast(LoginActivity.this, e.getMessage());
		}
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }
}
