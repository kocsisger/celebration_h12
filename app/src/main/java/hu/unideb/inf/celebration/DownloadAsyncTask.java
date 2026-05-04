package hu.unideb.inf.celebration;

import android.os.AsyncTask;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class DownloadAsyncTask extends AsyncTask<Void, Integer, String> {

    WeakReference<Button> weakButton;
    WeakReference<ProgressBar> weakProgressBar;
    WeakReference<TextView> weakTextView;

    public DownloadAsyncTask(Button b, ProgressBar pb, TextView tv) {
        this.weakButton = new WeakReference<>(b);
        this.weakProgressBar = new WeakReference<>(pb);
        this.weakTextView = new WeakReference<>(tv);
    }

    @Override
    protected String doInBackground(Void... voids) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "";
    }
}
