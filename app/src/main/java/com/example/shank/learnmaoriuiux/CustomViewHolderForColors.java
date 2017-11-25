package com.example.shank.learnmaoriuiux;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Process;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by shank on 18/11/2017.
 */
public class CustomViewHolderForColors extends RecyclerView.ViewHolder{

    private ImageView soundImage;
    private TextView englishWord;
    private TextView maoriWord;
    private LinearLayout colorLayout;
    private int soundFile;
    private Context context;
    private MediaPlayer player;

    public CustomViewHolderForColors(View itemView) {
        super(itemView);

        this.context = itemView.getContext();
        this.soundImage = (ImageView) itemView.findViewById(R.id.imgsoundcolorid);
        this.englishWord = (TextView) itemView.findViewById(R.id.colorenglishid);
        this.maoriWord = (TextView) itemView.findViewById(R.id.colormaoriid);
        this.colorLayout = (LinearLayout) itemView.findViewById(R.id.colorlinearlayoutid);

        this.soundImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        Process.setThreadPriority(Process.THREAD_PRIORITY_BACKGROUND);
                        if(player == null){
                            player = MediaPlayer.create(context, getSoundFile());
                        }
                        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                                player = null;
                            }
                        });
                        player.start();
                    }
                }).start();
            }
        });
    }

    public ImageView getSoundImage() {
        return soundImage;
    }

    public void setSoundImage(ImageView soundImage) {
        this.soundImage = soundImage;
    }

    public TextView getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(TextView englishWord) {
        this.englishWord = englishWord;
    }

    public TextView getMaoriWord() {
        return maoriWord;
    }

    public void setMaoriWord(TextView maoriWord) {
        this.maoriWord = maoriWord;
    }

    public LinearLayout getColorLayout() {
        return colorLayout;
    }

    public void setColorLayout(LinearLayout colorLayout) {
        this.colorLayout = colorLayout;
    }

    public int getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(int soundFile) {
        this.soundFile = soundFile;
    }
}
