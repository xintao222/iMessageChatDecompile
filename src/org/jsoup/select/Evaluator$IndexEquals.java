package org.jsoup.select;

import org.jsoup.nodes.Element;

public final class Evaluator$IndexEquals extends Evaluator.IndexEvaluator
{
  public final boolean a(Element paramElement1, Element paramElement2)
  {
    return paramElement2.p().intValue() == this.a;
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.a);
    return String.format(":eq(%d)", arrayOfObject);
  }
}

/* Location:           /Users/mdp/Downloads/iMessage/classes-dex2jar.jar
 * Qualified Name:     org.jsoup.select.Evaluator.IndexEquals
 * JD-Core Version:    0.6.2
 */