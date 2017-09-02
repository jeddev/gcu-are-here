package uk.co.gingerflan.gcuarehere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.location.Location;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;


public class GooglePlayServicesActivity extends AppCompatActivity

{
    protected static final int REQUEST_CODE_RESOLUTION = 1;
    private static final String TAG = "GooglePlayServicesActiv";
    private static final String KEY_IN_RESOLUTION = "is_in_resolution";
    protected Location myLastLocation;
    protected TextView myTextView;
    protected LocationRequest myLocationRequest;
    private GoogleApiClient mGoogleApiClient;
    private FusedLocationProviderClient mFusedLocationClient;
    private boolean mIsInResolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_play_services);

        myTextView = (TextView) findViewById(R.id.textView);

        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        mFusedLocationClient.getLastLocation()
                .addOnSuccessListener(this, new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {
                        // Got last known location. In some rare situations this can be null.
                      Log.e (TAG, "PUt some t ex in" + location);
                        if (location != null) {
                            myTextView.setText("Latitude: "+ location.getLatitude()
                                    + "\nLongitude: " + location.getLongitude());
                        }
                    }
                });

    }


}



