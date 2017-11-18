package codestart.info.androidplayvideo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import codestart.info.androidplayvideo.model.Video;
import codestart.info.androidplayvideo.util.VideoAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView mVideosListView;
    private List<Video> mVideosList = new ArrayList<>();
    private VideoAdapter mVideoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign video
        mVideosListView = (ListView) findViewById(R.id.videoListView);

        //create videos
        Video riverVideo = new Video("https://s3.amazonaws.com/androidvideostutorial/862009639.mp4");
        Video carsVideo = new Video("https://s3.amazonaws.com/androidvideostutorial/862013714.mp4");
        Video townVideo = new Video("https://s3.amazonaws.com/androidvideostutorial/862014159.mp4");
        Video whiteCarVideo = new Video("https://s3.amazonaws.com/androidvideostutorial/862014159.mp4");
        Video parkVideo = new Video("https://s3.amazonaws.com/androidvideostutorial/862014834.mp4");
        Video busyCityVideo = new Video("https://s3.amazonaws.com/androidvideostutorial/862017385.mp4");

        mVideosList.add(riverVideo);
        mVideosList.add(carsVideo);
        mVideosList.add(townVideo);
        mVideosList.add(whiteCarVideo);
        mVideosList.add(parkVideo);
        mVideosList.add(busyCityVideo);

        /***populate video list to adapter**/
        mVideoAdapter = new VideoAdapter(this, mVideosList);
        mVideosListView.setAdapter(mVideoAdapter);



    }
}
