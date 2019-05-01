package sylivia.herbal.com.herbalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class ImagesActivity extends AppCompatActivity {

    private static final String TAG= "ImagesActivity";

    //variables
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls= new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
        Log.d(TAG,"onCreate: started.");

        initImageBitmaps();

    }
    private void   initImageBitmaps(){
        Log.d(TAG,"initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://www.w3schools.com/howto/img_avatar.png");
        mNames.add("Currently not available");

        mImageUrls.add("https://www.w3schools.com/howto/img_avatar2.png");
        mNames.add("Currently not available");

        mImageUrls.add("https://www.w3schools.com/w3images/avatar2.png");
        mNames.add("Currently not available");

        mImageUrls.add("https://cdn.pixabay.com/photo/2018/04/28/13/18/man-3357275__340.png");
        mNames.add("Currently not available");


        mImageUrls.add("https://cdn.pixabay.com/photo/2016/08/20/05/36/avatar-1606914_960_720.png");
        mNames.add("Currently not available");

        mImageUrls.add("https://t4.ftcdn.net/jpg/01/05/72/55/240_F_105725565_vVl8Hc6kIRQsgquqdQYrz7fWFrfQAGCw.jpg");
        mNames.add("Currently not available");


        mImageUrls.add("https://media.forgecdn.net/avatars/124/768/636424778749237239.jpeg");
        mNames.add("Currently not available");

        mImageUrls.add("https://previews.123rf.com/images/gmast3r/gmast3r1603/gmast3r160300766/54398277-business-man-profile-icon-african-american-ethnic-male-avatar-hipster-style-fashion-cartoon-guy-bear.jpg");
        mNames.add("Currently not available");

        mImageUrls.add("http://avatars.design/wp-content/uploads/2016/09/avatar1b.jpg");
        mNames.add("Currently not available");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initializing staggered recyclerview.");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter =  new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ImagesActivity: onResume()");
    }
}