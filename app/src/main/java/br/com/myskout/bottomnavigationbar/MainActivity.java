package br.com.myskout.bottomnavigationbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    NotificationsFragment notificationsFragment = new NotificationsFragment();
    SettingsFragment settingsFragment = new SettingsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

bottomNavigationView = findViewById(R.id.bottomNavView);

lstInsta = new ArrayList<>();
lstInsta.add(new Insta(R.drawable.profile));


        bottomNavigationView = findViewById(R.id.bottomNavView);

        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.frmContainer, homeFragment).commit();

        BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.mNotifications);
        badgeDrawable.setVisible(true);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mHome:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.frmContainer, homeFragment).commit();
                        RecyclerView();

                        return true;
                    case R.id.mNotifications:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.frmContainer, notificationsFragment).commit();
                        return true;
                    case R.id.mSettings:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.frmContainer, settingsFragment).commit();
                        return true;
                }


                return false;
            }
        });


    }
    private void RecyclerView(){
        recyclerViewInsta = findViewById(R.id.idRecyclerFilmes);
        recyclerViewInsta.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        recyclerViewInsta

    }
}