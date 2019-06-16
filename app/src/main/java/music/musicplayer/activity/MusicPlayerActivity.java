package music.musicplayer.activity;

import android.support.v4.app.Fragment;

import music.musicplayer.R;
import music.musicplayer.base.FragmentContainerActivity;
import music.musicplayer.fragment.PlayLocalMusicFragment;


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
