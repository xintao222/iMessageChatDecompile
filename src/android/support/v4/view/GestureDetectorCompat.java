package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

public class GestureDetectorCompat
{
  private final GestureDetectorCompat.GestureDetectorCompatImpl mImpl;

  public GestureDetectorCompat(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener)
  {
    this(paramContext, paramOnGestureListener, null);
  }

  public GestureDetectorCompat(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      this.mImpl = new GestureDetectorCompat.GestureDetectorCompatImplJellybeanMr1(paramContext, paramOnGestureListener, paramHandler);
      return;
    }
    this.mImpl = new GestureDetectorCompat.GestureDetectorCompatImplBase(paramContext, paramOnGestureListener, paramHandler);
  }

  public boolean isLongpressEnabled()
  {
    return this.mImpl.isLongpressEnabled();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.mImpl.onTouchEvent(paramMotionEvent);
  }

  public void setIsLongpressEnabled(boolean paramBoolean)
  {
    this.mImpl.setIsLongpressEnabled(paramBoolean);
  }

  public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    this.mImpl.setOnDoubleTapListener(paramOnDoubleTapListener);
  }
}

/* Location:           /Users/mdp/Downloads/iMessage/classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.GestureDetectorCompat
 * JD-Core Version:    0.6.2
 */