package com.shuo.archeotechar.helloar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.shuo.archeotechar.fragments.AntiquityFragment;
import com.shuo.archeotechar.fragments.ContestFragment;
import com.shuo.archeotechar.fragments.StoryFragment;

public class CollectionsViewPagerAdapter extends FragmentStateAdapter {

    public CollectionsViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new AntiquityFragment();
            case 1:
                return new StoryFragment();
            case 2:
                return new ContestFragment();
            default:
                return new AntiquityFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
