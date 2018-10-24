package Themexamples;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.print.DocFlavor;
import java.applet.*;
import java.*;
import java.io.*;
import java.net.URL;
import java.util.Scanner;


public class MyPod {
    // class and instance variables first
    private String[] names;
    private String[] clipurls;
    private int selectedClip, numClips;
    private AudioClip audioclip;
    private File audiofile;

    private final int maxclips = 200;

    public MyPod(String audio) throws IOException {
        audiofile = new File(audio);

        names = new String[maxclips];
        clipurls = new String[maxclips];

        selectedClip = 0;
        numClips = 0;

        Scanner filescan = new Scanner(audiofile);

        // reading in the filedata

        while(filescan.hasNext()){
            names[numClips] = filescan.nextLine();
            clipurls[numClips] = filescan.nextLine();
            numClips++;
        }
        filescan.close();
        selectedClip();

    }

    private void selectedClip() {// Displays name of the selected clip
        System.out.println("Selected Clip: " + names[selectedClip] +  "\n ");
    }

    public void up(){
        if(selectedClip < maxclips - 1) {
            selectedClip++;
            selectedClip();
        }
    }

    public void down(){
        if(selectedClip>0){
            selectedClip--;
            selectedClip();
        }

    }

    public void play() throws IOException{
        selectedClip();
        if(audioclip != null){
            audioclip.stop();
        }

        URL url = new URL(clipurls[selectedClip]);
        audioclip = Applet.newAudioClip(url);
        audioclip.play();
    }

    public void stop(){
        selectedClip();
        if(audioclip != null){
            audioclip.stop();
        }

    }

    public  void loop() throws IOException {
        selectedClip();
        if(audioclip != null){
            audioclip.stop();
        }
        URL url = new URL(clipurls[selectedClip]);
        audioclip = Applet.newAudioClip(url);
        audioclip.loop();
    }

    public void turnoff() {
        System.out.println("\n\n*****Turning off myPod....Bye*****\n\n ");

    }
}
