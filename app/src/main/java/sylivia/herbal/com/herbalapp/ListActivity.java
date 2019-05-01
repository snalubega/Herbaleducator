package sylivia.herbal.com.herbalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;


public class ListActivity extends AppCompatActivity {

    int[] IMAGES={R.drawable.d1,R.drawable.d2,R.drawable.d3,R.drawable.d4,R.drawable.d5,R.drawable.d7,R.drawable.d8,R.drawable.d9};
    // String[] NAMES={"Flower 0ne","Flower two","Flower three","Flower four","Flower five","Flower six","Flower seven","Flower eight"};
    //String[] DESCRIPTION={"Good","Nice","Cute","Beautiful","Well","Fancy","Well","Fancy"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listView=(ListView)findViewById(R.id.listview);

        //setting a custom adapter for the listview
        CustomAdapter customAdapter= new CustomAdapter();
        listView.setAdapter(customAdapter);



    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView=getLayoutInflater().inflate(R.layout.image_item,null);

            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView);
            //TextView textView_name=(TextView)convertView.findViewById(R.id.textView_name);
            // TextView textview_description=(TextView)convertView.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[position]);
            // textView_name.setText(NAMES[position]);
            // textview_description.setText(DESCRIPTION[position]);


            /*convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this,NextActivity.class);
                    startActivity(intent);
                }
            });*/
            return convertView;
        }
    }


}

