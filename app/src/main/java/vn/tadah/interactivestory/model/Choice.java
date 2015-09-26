package vn.tadah.interactivestory.model;

/**
 * Created by VietNam on 9/26/15.
 */
public class Choice {
    private String mText;
    private int mNextPage;
    public Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }
    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public int getmNextPage() {
        return mNextPage;
    }

    public void setmNextPage(int mNextPage) {
        this.mNextPage = mNextPage;
    }
}
