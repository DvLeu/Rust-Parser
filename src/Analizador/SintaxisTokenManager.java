/* Generated By:JavaCC: Do not edit this line. SintaxisTokenManager.java */
package Analizador;

/** Token Manager. */
public class SintaxisTokenManager implements SintaxisConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3ffff80L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 0;
            return 13;
         }
         if ((active0 & 0x20000000L) != 0L)
            return 5;
         return -1;
      case 1:
         if ((active0 & 0x3fef700L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 1;
            return 13;
         }
         if ((active0 & 0x10880L) != 0L)
            return 13;
         return -1;
      case 2:
         if ((active0 & 0x588300L) != 0L)
            return 13;
         if ((active0 & 0x3a67400L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 54;
               jjmatchedPos = 2;
            }
            return 13;
         }
         return -1;
      case 3:
         if ((active0 & 0x3844400L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 54;
               jjmatchedPos = 3;
            }
            return 13;
         }
         if ((active0 & 0x223000L) != 0L)
            return 13;
         return -1;
      case 4:
         if ((active0 & 0x3800400L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 4;
            return 13;
         }
         if ((active0 & 0x44000L) != 0L)
            return 13;
         return -1;
      case 5:
         if ((active0 & 0x800400L) != 0L)
            return 13;
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 5;
            return 13;
         }
         return -1;
      case 6:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 6;
            return 13;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         {
         jjmatchedKind = 39;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 37:
         return jjStopAtPos(0, 30);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 40:
         return jjStopAtPos(0, 41);
      case 41:
         return jjStopAtPos(0, 42);
      case 42:
         return jjStopAtPos(0, 28);
      case 43:
         return jjStopAtPos(0, 26);
      case 44:
         return jjStopAtPos(0, 47);
      case 45:
         {
         jjmatchedKind = 27;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 46:
         return jjMoveStringLiteralDfa1_0(0x100000000000000L);
      case 47:
         return jjStartNfaWithStates_0(0, 29, 5);
      case 58:
         return jjStopAtPos(0, 49);
      case 59:
         return jjStopAtPos(0, 48);
      case 60:
         {
         jjmatchedKind = 33;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 61:
         {
         jjmatchedKind = 40;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 62:
         {
         jjmatchedKind = 34;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 91:
         return jjStopAtPos(0, 43);
      case 93:
         return jjStopAtPos(0, 44);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x3000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x148080L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x90800L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x3000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0xc00000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 123:
         return jjStopAtPos(0, 45);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 125:
         return jjStopAtPos(0, 46);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 46:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(1, 56);
         break;
      case 51:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 54:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 61:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         break;
      case 62:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(1, 50);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x500L);
      case 70:
      case 102:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(1, 11, 13);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x3000L);
      case 78:
      case 110:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(1, 7, 13);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(1, 16, 13);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x208000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x3020000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0xc00000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 124:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 50:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 13);
         break;
      case 52:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 13);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x3004000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 82:
      case 114:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 13);
         else if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x3000L);
      case 84:
      case 116:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(2, 8, 13);
         else if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 13);
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 13);
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 76:
      case 108:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 13);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x3000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 69:
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 13);
         else if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 13);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x3000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 33:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(5, 25);
         break;
      case 71:
      case 103:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 13);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 78:
      case 110:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 10, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 70:
      case 102:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(6, 13);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 33:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(7, 24);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 19;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  else if (curChar == 47)
                     jjCheckNAddTwoStates(6, 7);
                  if ((0xfffffffeffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(10, 11);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 5;
                  if (curChar == 47)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 1:
                  if ((0xfffffffeffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 3:
                  if ((0xfffffffeffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 4:
                  if (curChar == 47 && kind > 5)
                     kind = 5;
                  break;
               case 6:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(6, 7);
                  break;
               case 7:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 8:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 9:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 10:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 11:
                  if (curChar == 34 && kind > 53)
                     kind = 53;
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAddStates(0, 2);
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(15);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(16, 17);
                  break;
               case 17:
                  if (curChar == 46)
                     jjCheckNAdd(18);
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAdd(18);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  jjCheckNAddTwoStates(3, 4);
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 0:
               case 13:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  jjCheckNAdd(13);
                  break;
               case 1:
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
               case 3:
                  jjCheckNAddTwoStates(3, 4);
                  break;
               case 6:
                  jjAddStates(3, 4);
                  break;
               case 10:
                  jjAddStates(5, 6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
               case 3:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 6:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 4);
                  break;
               case 10:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(5, 6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 19 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   15, 16, 17, 6, 7, 10, 11, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, "\53", 
"\55", "\52", "\57", "\45", "\75\75", "\41\75", "\74", "\76", "\74\75", "\76\75", 
"\46\46", "\174\174", "\41", "\75", "\50", "\51", "\133", "\135", "\173", "\175", "\54", 
"\73", "\72", "\55\76", null, null, null, null, null, "\56\56", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x1ffffffffffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[19];
private final int[] jjstateSet = new int[38];
StringBuffer image;
int jjimageLen;
int lengthOfMatch;
protected char curChar;
/** Constructor. */
public SintaxisTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public SintaxisTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 19; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         tokenImage = "";
      else
         tokenImage = image.toString();
      beginLine = endLine = input_stream.getBeginLine();
      beginColumn = endColumn = input_stream.getBeginColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      tokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 55;
   jjmatchedPos = -1;
   curPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

int[] jjemptyLineNo = new int[1];
int[] jjemptyColNo = new int[1];
boolean[] jjbeenHere = new boolean[1];
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
         break;
      case 7 :
         break;
      case 8 :
         break;
      case 9 :
         break;
      case 10 :
         break;
      case 11 :
         break;
      case 12 :
         break;
      case 13 :
         break;
      case 14 :
         break;
      case 15 :
         break;
      case 16 :
         break;
      case 17 :
         break;
      case 18 :
         break;
      case 19 :
         break;
      case 20 :
         break;
      case 21 :
         break;
      case 22 :
         break;
      case 23 :
         break;
      case 24 :
         break;
      case 25 :
         break;
      case 26 :
         break;
      case 27 :
         break;
      case 28 :
         break;
      case 29 :
         break;
      case 30 :
         break;
      case 31 :
         break;
      case 32 :
         break;
      case 33 :
         break;
      case 34 :
         break;
      case 35 :
         break;
      case 36 :
         break;
      case 37 :
         break;
      case 38 :
         break;
      case 39 :
         break;
      case 40 :
         break;
      case 41 :
         break;
      case 42 :
         break;
      case 43 :
         break;
      case 44 :
         break;
      case 45 :
         break;
      case 46 :
         break;
      case 47 :
         break;
      case 48 :
         break;
      case 49 :
         break;
      case 50 :
         break;
      case 51 :
         break;
      case 52 :
         break;
      case 53 :
         break;
      case 54 :
         break;
      case 55 :
         if (jjmatchedPos == -1)
         {
            if (jjbeenHere[0] &&
                jjemptyLineNo[0] == input_stream.getBeginLine() && 
                jjemptyColNo[0] == input_stream.getBeginColumn())
               throw new TokenMgrError(("Error: Bailing out of infinite loop caused by repeated empty string matches at line " + input_stream.getBeginLine() + ", column " + input_stream.getBeginColumn() + "."), TokenMgrError.LOOP_DETECTED);
            jjemptyLineNo[0] = input_stream.getBeginLine();
            jjemptyColNo[0] = input_stream.getBeginColumn();
            jjbeenHere[0] = true;
         }
         break;
      case 56 :
         break;
      default : 
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
