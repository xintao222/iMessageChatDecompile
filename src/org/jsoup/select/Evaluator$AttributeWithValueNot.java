package org.jsoup.select;

import org.jsoup.nodes.Element;

public final class Evaluator$AttributeWithValueNot extends Evaluator.AttributeKeyPair
{
  public final boolean a(Element paramElement1, Element paramElement2)
  {
    return !this.b.equalsIgnoreCase(paramElement2.c(this.a));
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = this.b;
    return String.format("[%s!=%s]", arrayOfObject);
  }
}

/* Location:           /Users/mdp/Downloads/iMessage/classes-dex2jar.jar
 * Qualified Name:     org.jsoup.select.Evaluator.AttributeWithValueNot
 * JD-Core Version:    0.6.2
 */