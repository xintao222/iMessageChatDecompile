package android.support.v4.app;

class FragmentManagerImpl$2
  implements Runnable
{
  FragmentManagerImpl$2(FragmentManagerImpl paramFragmentManagerImpl)
  {
  }

  public void run()
  {
    this.this$0.popBackStackState(this.this$0.mActivity.mHandler, null, -1, 0);
  }
}

/* Location:           /Users/mdp/Downloads/iMessage/classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentManagerImpl.2
 * JD-Core Version:    0.6.2
 */