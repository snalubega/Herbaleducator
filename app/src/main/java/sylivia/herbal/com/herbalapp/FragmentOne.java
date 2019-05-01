package sylivia.herbal.com.herbalapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_one, container, false);


        final SwipeRefreshLayout mSwipeRefreshLayout = (SwipeRefreshLayout) v.findViewById(R.id.fragment_one);

        mSwipeRefreshLayout.setOnRefreshListener(
                new SwipeRefreshLayout.OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        ((FragmentsActivity) getActivity()).refreshNow();
                        Toast.makeText(getContext(), "Refresh Layout working", Toast.LENGTH_LONG).show();
                    }
                }
        );


        String[] awayStrings = {
                "Medicago sativa",
                "Aloes ferox",
                "Angelica archangelica",
                "Maranta arundinaceae",
                "Cynara scolymus",
                "Withania somnifera",
                "Astragalus membranaceus",
                "Berberis vulgaris",
                "Hordeum vulgare",
                "Ocimum basilicum",
                "Laurus nobilis",
                "Myrica cerifera",
                "Beta vulgaris rubra",
                "Montmorillinite",
                "Vaccinium myrtillus",
                "Juglans nigra"
        };

        ListView lv = (ListView) v.findViewById(R.id.listView2);

        ArrayAdapter<String> lva = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, awayStrings);
        lv.setAdapter(lva);



        return v;
    }
}





