package com.example.firebaseactivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class galleryActivity extends AppCompatActivity {
    private CircleImageView mProfileCircularImageView;
    private Button btChooseImage;
    final static int PICK_IMAGE_REQUEST_CODE=1;
    private Uri imagePathUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        mProfileCircularImageView=(CircleImageView)findViewById(R.id.ci_circular_image_view_id);
        btChooseImage=(Button)findViewById(R.id.bt_choose_image_id);
        btChooseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseImage();
            }
        });

    }

    private void chooseImage() {
        Intent intentChooseImage = new Intent();
        intentChooseImage.setType("image/*");
        intentChooseImage.setAction(Intent.ACTION_GET_CONTENT);

        startActivityForResult(intentChooseImage,PICK_IMAGE_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST_CODE && resultCode == RESULT_OK && data !=null && data.getData()!=null){
            imagePathUri=data.getData();
            mProfileCircularImageView.setImageURI(imagePathUri);
        }
    }
}


