package com.jeevscode.jeeva.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by jeeva on 22/09/17.
 */

public class PhotoGalleryActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, PhotoGalleryActivity.class);
    }


    @Override
    protected Fragment createFragment() {

        return new PhotoGalleryFragment();
    }

}
