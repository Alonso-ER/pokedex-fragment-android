package com.almaralengineering.pokedex;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class StatsFragment extends Fragment {

    private static final String POKEMON_STATS = "pokemonStats";
    public StatsFragment() {
        // Required empty public constructor
    }
    public static StatsFragment newInstance(Stats pokemonStats) {
        StatsFragment fragment = new StatsFragment();
        Bundle args = new Bundle();
        args.putParcelable(POKEMON_STATS, pokemonStats);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_stats, container, false);
        TextView hpTextView = (TextView) view.findViewById(R.id.fragment_stats_hp);
        TextView attackTextView = (TextView) view.findViewById(R.id.fragment_stats_atk);
        TextView defenseTextView = (TextView) view.findViewById(R.id.fragment_stats_def);
        TextView speedTextView = (TextView) view.findViewById(R.id.fragment_stats_sp);

        if(getArguments() != null){
            Stats stats = getArguments().getParcelable(POKEMON_STATS);
            hpTextView.setText(stats.getHp());
            attackTextView.setText(stats.getAtk());
            defenseTextView.setText(stats.getDef());
            speedTextView.setText(stats.getSp());
        }
        return view;
    }
}