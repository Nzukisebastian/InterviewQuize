package com.example.interviewquizeprayer;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class Prayer extends Fragment {
    RecyclerView mRecyclerview;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mManager;
    List<Prayerdetails> mListitems;
    ProgressBar progressBar;
    View v;
    public Prayer(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.layout_fragment, container, false);
        mRecyclerview=(RecyclerView)v.findViewById(R.id.recyclerTemp);
        progressBar=(ProgressBar)v.findViewById(R.id.pb);
        mListitems=new ArrayList<>();
        mManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        mRecyclerview.setLayoutManager(mManager);
        mAdapter=new Adapterprayer(mListitems,getActivity());
        mRecyclerview.setAdapter(mAdapter);
        request();
        return v;
    }
    private void request(){
        progressBar.setVisibility(View.VISIBLE);
        String motivate="The topic of finances and work can be a constant worry to some because it makes up such a large part of our daily lives. There is stress in not making enough money, fear in losing a job, jealousy in seeing someone else's accomplishments when you've worked just as hard, and weariness in a taxing, underappreciated position. Sometimes you just want to quit and do something else. Other times you need something, anything to support yourself and your family; yet, opportunities seem scarce.\n" +
                "\n" +
                "Whether you're miserable at your current job or are unemployed and searching, your first reaction may be to try and take control of the situation. When we try to control the situation ourselves, we tend to get stressed easily and may begin to feel down when we don’t see the results we want. What we need to do is to take our impatience, our longing for blessing, our desire to support loved ones, and our hurt from the workplace and put it at the feet of the only One who is in control—Jesus, our sovereign Savior and King. \n" +
                "\n" +
                "We have a God who can relate, and he is a God who wants to hear from us even in our most trying moments. Our heavenly Father knows everything that’s going on in our lives, but he still wants us to seek him and confide in him. He wants us to trust him that he will hold us close no matter what turns our lives may take. Use this prayer for employment to speak powerful words of belief and hope over your life. ";


        String prayer=" Dear God,\n" +
                "You know my needs. You know my desire for a job, for work I enjoy doing, for the next step in my career to present itself. I pray that you would guide me as I continue on this job hunting journey. May I focus first on your will for my life, putting your desires and your plan above my own wishes and wants. Open doors to new opportunities that you desire for me, and equip me with the skills, knowledge, and wisdom I need to take steps forward in this process. As I craft my resume, write cover letters, submit my applications, connect with new companies and potential employers, and go on interviews,  give me the words to speak and the courage to share who I am and what I can do. Give me confidence that can only come from you, and give me humility too. I trust you, Lord-- my life is in your hands. Your will be done. Thank you for being near to me every step of the way and thank you for always providing for my every need. May this all be for your glory.\n" +
                "\n" +
                "In your name,\n" +
                "Amen.";
        // model.setTitle(data.getString("title"));
        mListitems.add(new Prayerdetails("Motivation",motivate));
        mListitems.add(new Prayerdetails("A Prayer for Employment",prayer));
        progressBar.setVisibility(View.GONE);

    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
}
