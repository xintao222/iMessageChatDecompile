package org.jsoup.parser;

 enum TokeniserState$39
{
  TokeniserState$39()
  {
    super(str, 38, (byte)0);
  }

  final void a(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    String str = paramCharacterReader.a(new char[] { 39, 38, 0 });
    if (str.length() > 0)
      paramTokeniser.b.d(str);
    switch (paramCharacterReader.d())
    {
    default:
      return;
    case '\'':
      paramTokeniser.a(O);
      return;
    case '&':
      char[] arrayOfChar = paramTokeniser.a(Character.valueOf('\''), true);
      if (arrayOfChar != null)
      {
        paramTokeniser.b.a(arrayOfChar);
        return;
      }
      paramTokeniser.b.c('&');
      return;
    case '\000':
      paramTokeniser.c(this);
      paramTokeniser.b.c(65533);
      return;
    case '￿':
    }
    paramTokeniser.d(this);
    paramTokeniser.a(a);
  }
}

/* Location:           /Users/mdp/Downloads/iMessage/classes-dex2jar.jar
 * Qualified Name:     org.jsoup.parser.TokeniserState.39
 * JD-Core Version:    0.6.2
 */