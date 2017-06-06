package app.dev.parallaxheader;

import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.htab_viewpager);
        tabs = (TabLayout) findViewById(R.id.tab_layout);
        tabs.setupWithViewPager(viewPager);
        setupViewPager();
    }

    private void setupViewPager(){
        ViewPagerAdapter adapter = new ViewPagerAdapter(
                getSupportFragmentManager());
        adapter.addFrag(new DummyFragment(),"ITEMS");
        adapter.addFrag(new DummyFragment(), "INFO");
        viewPager.setAdapter(adapter);
    }
}
