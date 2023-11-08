package com.example.toyshopproject.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.toyshopproject.HomeActivity;
import com.example.toyshopproject.MainActivity;
import com.example.toyshopproject.R;
import com.google.android.material.button.MaterialButton;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView car, ship, train, plane;
    private ImageView doll, robot, ball, block;
    private ImageView watergun, yoyo, music, teddy;

    private MaterialButton LogoutBtn, CheckOrdersBtn, maintainProductsBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (MaterialButton) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (MaterialButton) findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (MaterialButton) findViewById(R.id.maintain_btn);

        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });

        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin", "Admin");
                startActivity(intent);
            }
        });

        car = (ImageView) findViewById(R.id.car);
        ship = (ImageView) findViewById(R.id.ship);
        train = (ImageView) findViewById(R.id.train);
        plane = (ImageView) findViewById(R.id.plane);

        doll = (ImageView) findViewById(R.id.doll);
        robot = (ImageView) findViewById(R.id.robot);
        ball = (ImageView) findViewById(R.id.ball);
        block = (ImageView) findViewById(R.id.block);

        watergun = (ImageView) findViewById(R.id.watergun);
        yoyo = (ImageView) findViewById(R.id.yoyo);
        music = (ImageView) findViewById(R.id.music);
        teddy = (ImageView) findViewById(R.id.teddybear);


        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","car");
                startActivity(intent);
            }
        });

        ship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","ship");
                startActivity(intent);
            }
        });

        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","train");
                startActivity(intent);
            }
        });

        plane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","plane");
                startActivity(intent);
            }
        });


        doll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","doll");
                startActivity(intent);
            }
        });

        robot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","robot");
                startActivity(intent);
            }
        });

        ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","ball");
                startActivity(intent);
            }
        });

        block.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","block");
                startActivity(intent);
            }
        });

        watergun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","watergun");
                startActivity(intent);
            }
        });

        yoyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","yoyo");
                startActivity(intent);
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","music");
                startActivity(intent);
            }
        });

        teddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","teddy");
                startActivity(intent);
            }
        });
    }
}