package cl.isisur.semana8;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView mivideo = findViewById(R.id.video);

        String videop = "android.resource://"+getPackageName()+ "/" +R.raw.video;
        Uri url = Uri.parse(videop);
        mivideo.setVideoURI(url);

        MediaController mediaController = new MediaController(this);
        mivideo.setMediaController(mediaController);
        mediaController.setAnchorView(mivideo);

    }
}