package com.example.pikpok;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PerformanceHintManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private List<MediaObject> videoList;
    private DemoAdapter adapter;
    private ImageView fav;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //////////////////////////////////////////
        videoList = new ArrayList<>();
        viewPager2 = findViewById(R.id.videopager2);

        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.a, "WhatsApp Status", "Description " +
                "Description Description Description Description Description Description Description Description Description"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.c, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.e, "WhatsApp Status", "Description " +
                "Description Description Description Description Description Description Description Description Description"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.f, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.g, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.i, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.j, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.h, "WhatsApp Status", "Description " +
                "Description Description Description Description Description Description Description Description Description"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.k, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.l, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.m, "WhatsApp Status", "Description " +
                "Description Description Description Description Description Description Description Description Description"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.n, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.o, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.p, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.q, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.r, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.s, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.t, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.v, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.w, "WhatsApp Status", "eidwejie"));
        videoList.add(new MediaObject("android.resource://" + getPackageName() + "/" + R.raw.k, "WhatsApp Status", "eidwejie"));

        adapter = new DemoAdapter(videoList);
        viewPager2.setAdapter(adapter);

    }


    ///////////////////////////////////////////////////////////////////////////

    public void profile(View view) {
        startActivity(new Intent(HomeActivity.this, LoginActivity.class));
    }

    public void commit(View view) {

        showDialog();
    }
    private void showDialog() {

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomsheetlayout);

        LinearLayout editLayout = dialog.findViewById(R.id.layoutEdit);
        LinearLayout shareLayout = dialog.findViewById(R.id.layoutShare);
        LinearLayout uploadLayout = dialog.findViewById(R.id.layoutUpload);
        LinearLayout printLayout = dialog.findViewById(R.id.layoutPrint);

        editLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                Toast.makeText(HomeActivity.this, "PeloTon Email", Toast.LENGTH_SHORT).show();

            }
        });

        shareLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                Toast.makeText(HomeActivity.this, "Netflix Email", Toast.LENGTH_SHORT).show();

            }
        });

        uploadLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                Toast.makeText(HomeActivity.this, "Costco Email", Toast.LENGTH_SHORT).show();

            }
        });

        printLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                Toast.makeText(HomeActivity.this, "Apple Email", Toast.LENGTH_SHORT).show();

            }
        });

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);

    }
//////////////////////////////////////////////////////////////
    public void comment(View view) {

        showDialog1();
    }




    private void showDialog1() {

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.commitdilog);

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }
////////////////////////////////////////////////////////////////
    public void share(View view) {

            showDialog3();
        }


        public void showDialog3() {

            final Dialog dialog = new Dialog(this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.sharedilog);
            ImageView send1 = dialog.findViewById(R.id.send1);
            ImageView send2 = dialog.findViewById(R.id.send2);
            LinearLayout uploadLayout = dialog.findViewById(R.id.layoutUpload);
            LinearLayout printLayout = dialog.findViewById(R.id.layoutPrint);

            send1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dialog.dismiss();
                    Toast.makeText(HomeActivity.this, " Send Successfully ", Toast.LENGTH_SHORT).show();

                }
            });
            send2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dialog.dismiss();
                    Toast.makeText(HomeActivity.this, " Send Successfully ", Toast.LENGTH_SHORT).show();

                }
            });

            dialog.show();
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
            dialog.getWindow().setGravity(Gravity.BOTTOM);
        }

    public void like(View view) {
        fav=findViewById(R.id.imageView5);
        fav.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fav.setImageResource(R.drawable.ic_baseline_favorite_24);
            }
        });
    }
///////////////////////////////////////////////////////
    public void Search(View view) {
        startActivity(new Intent(HomeActivity.this,SearchActivity1.class));

    }

    public void Camera(View view) {
        startActivity(new Intent(HomeActivity.this,CameraActivity.class));
    }

//////////////////////////////////////////////////////////////////////////////


}



