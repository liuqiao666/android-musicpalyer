package io.innofang.music.activity;

import android.support.v4.app.Fragment;

import io.innofang.music.R;
import io.innofang.music.base.FragmentContainerActivity;
import io.innofang.music.fragment.PlayLocalMusicFragment;


public class MusicPlayerActivity extends FragmentContainerActivity {
    @Override
    protected Fragment createFragment() {
        return PlayLocalMusicFragment.newInstance();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_fragment;
    }

    @Override
    protected int getFragmentContainerId() {
        return R.id.fragment_container;
    }
}
