package org.jsoup.parser;

 enum TokeniserState$58
{
  TokeniserState$58()
  {
    super(str, 57, (byte)0);
  }

  final void a(Tokeniser paramTokeniser, CharacterReader paramCharacterReader)
  {
    char c = paramCharacterReader.d();
    switch (c)
    {
    default:
      paramTokeniser.c.c.append(c);
      return;
    case '\'':
      paramTokeniser.a(ag);
      return;
    case '\000':
      paramTokeniser.c(this);
      paramTokeniser.c.c.append(65533);
      return;
    case '>':
      paramTokeniser.c(this);
      paramTokeniser.c.e = true;
      paramTokeniser.g();
      paramTokeniser.a(a);
      return;
    case '￿':
    }
    paramTokeniser.d(this);
    paramTokeniser.c.e = true;
    paramTokeniser.g();
    paramTokeniser.a(a);
  }
}

/* Location:           /Users/mdp/Downloads/iMessage/classes-dex2jar.jar
 * Qualified Name:     org.jsoup.parser.TokeniserState.58
 * JD-Core Version:    0.6.2
 */