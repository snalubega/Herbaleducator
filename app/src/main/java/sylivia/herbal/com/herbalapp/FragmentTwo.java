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
public class FragmentTwo extends Fragment {


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        // Inflate the layout for this fragment
        String[] awayStrings = {
                "Alfalfa leaf powder",
                "Alfalfa Sprout seeds whole",
                "Aloe powder",
                "Angelica Root powder",
                "Arrowroot powder",
                "Artichoke Leaf powder",
                "Ashwagandha Root powder",
                "Astragalus Root powder",
                "Barberry Root Bark Powder",
                "Barley Grass Powder",
                "Basil Leaf cut/sifted",
                "Bay Leaf whole",
                "Bayberry  Bark Powder ",
                "Bee Pollen granules, Oregon",
                "Beet Leaf powder",
                "Beet Root powder"
        };

        ListView lv = (ListView) view.findViewById(R.id.listView2);

        ArrayAdapter<String> lva = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, awayStrings);
        lv.setAdapter(lva);

        final SwipeRefreshLayout mSwipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.fragment_two);

        mSwipeRefreshLayout.setOnRefreshListener(
                new SwipeRefreshLayout.OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        ((FragmentsActivity) getActivity()).refreshNow();
                        Toast.makeText(getContext(), "Refresh Layout working", Toast.LENGTH_LONG).show();
                    }
                }
        );

        return view;
    }
}

