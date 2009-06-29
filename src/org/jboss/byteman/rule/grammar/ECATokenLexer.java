/* The following code was generated by JFlex 1.4.2 on 6/29/09 3:12 PM */

/*
* JBoss, Home of Professional Open Source
* Copyright 2008, Red Hat Middleware LLC, and individual contributors
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* This is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as
* published by the Free Software Foundation; either version 2.1 of
* the License, or (at your option) any later version.
*
* This software is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this software; if not, write to the Free
* Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
* 02110-1301 USA, or see the FSF site: http://www.fsf.org.
*
* @authors Andrew Dinn
*/

package org.jboss.byteman.rule.grammar;

import java_cup.runtime.*;
import org.jboss.byteman.rule.grammar.PrintableSymbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.2
 * on 6/29/09 3:12 PM from the specification file
 * <tt>dd/grammar/flex/ECAToken.flex</tt>
 */
public class ECATokenLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int QUOTEDIDENT = 4;
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\65\1\106"+
    "\1\110\1\5\1\103\1\64\1\107\1\52\1\53\1\73\1\10\1\57"+
    "\1\62\1\12\1\76\1\6\11\7\1\105\1\56\1\61\1\60\1\70"+
    "\1\104\1\0\1\42\1\13\1\4\1\16\1\37\1\23\1\31\1\30"+
    "\1\14\2\4\1\43\1\74\1\15\1\25\1\101\1\66\1\35\1\44"+
    "\1\27\1\36\1\77\1\50\3\4\1\54\1\111\1\55\1\71\1\4"+
    "\1\0\1\45\1\17\1\4\1\22\1\11\1\24\1\34\1\33\1\20"+
    "\2\4\1\46\1\75\1\21\1\26\1\102\1\67\1\40\1\47\1\32"+
    "\1\41\1\100\1\51\3\4\1\0\1\63\1\0\1\72\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\2\2\1\3\1\1\2\4\1\5\1\3"+
    "\1\6\27\3\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\2\3\1\27\2\3\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\36\2\43\1\44\1\45\2\46\3\47\2\0\1\50"+
    "\1\51\1\3\1\52\1\3\1\53\1\3\1\54\5\3"+
    "\1\55\3\3\1\23\1\56\6\3\1\16\1\57\1\3"+
    "\1\51\1\57\1\0\1\55\1\60\1\53\1\56\6\3"+
    "\1\61\1\62\1\63\1\64\2\50\1\0\2\50\1\3"+
    "\1\22\2\3\1\22\13\3\1\60\1\15\1\3\1\30"+
    "\3\3\1\65\10\3\1\66\6\3\1\5\4\3\1\67"+
    "\1\26\1\70\2\3\1\17\1\3\1\27\1\3\1\71"+
    "\1\72";

  private static int [] zzUnpackAction() {
    int [] result = new int[186];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\112\0\224\0\336\0\u0128\0\u0172\0\u0128\0\u01bc"+
    "\0\u0206\0\u0250\0\u029a\0\u02e4\0\u032e\0\u0128\0\u0378\0\u03c2"+
    "\0\u040c\0\u0456\0\u04a0\0\u04ea\0\u0534\0\u057e\0\u05c8\0\u0612"+
    "\0\u065c\0\u06a6\0\u06f0\0\u073a\0\u0784\0\u07ce\0\u0818\0\u0862"+
    "\0\u08ac\0\u08f6\0\u0940\0\u098a\0\u09d4\0\u0128\0\u0128\0\u0128"+
    "\0\u0128\0\u0128\0\u0128\0\u0a1e\0\u0a68\0\u02e4\0\u0ab2\0\u0afc"+
    "\0\u0b46\0\u0b90\0\u0128\0\u0128\0\u0128\0\u0bda\0\u0c24\0\u0128"+
    "\0\u0c6e\0\u0cb8\0\u0128\0\u0128\0\u0128\0\u0128\0\u0128\0\u0128"+
    "\0\u0d02\0\u0128\0\u0128\0\u0128\0\u0d4c\0\u0d96\0\u0de0\0\u0128"+
    "\0\u0128\0\u0128\0\u0e2a\0\u0128\0\u0e74\0\u0128\0\u0ebe\0\u0f08"+
    "\0\u0f52\0\u0f9c\0\u01bc\0\u0fe6\0\u01bc\0\u1030\0\u01bc\0\u107a"+
    "\0\u01bc\0\u10c4\0\u110e\0\u1158\0\u11a2\0\u11ec\0\u01bc\0\u1236"+
    "\0\u1280\0\u12ca\0\u01bc\0\u01bc\0\u1314\0\u135e\0\u13a8\0\u13f2"+
    "\0\u143c\0\u1486\0\u01bc\0\u01bc\0\u14d0\0\u0128\0\u0128\0\u151a"+
    "\0\u0128\0\u0128\0\u0128\0\u0128\0\u1564\0\u15ae\0\u15f8\0\u1642"+
    "\0\u168c\0\u16d6\0\u0128\0\u0128\0\u0128\0\u0128\0\u0128\0\u1720"+
    "\0\u176a\0\u17b4\0\u17fe\0\u1848\0\u1892\0\u18dc\0\u1926\0\u1970"+
    "\0\u19ba\0\u1a04\0\u1a4e\0\u1a98\0\u1ae2\0\u1b2c\0\u1b76\0\u1bc0"+
    "\0\u1c0a\0\u1c54\0\u1c9e\0\u01bc\0\u0128\0\u1ce8\0\u01bc\0\u1d32"+
    "\0\u1d7c\0\u1dc6\0\u01bc\0\u1e10\0\u1e5a\0\u1ea4\0\u1eee\0\u1f38"+
    "\0\u1f82\0\u1fcc\0\u2016\0\u01bc\0\u2060\0\u20aa\0\u20f4\0\u213e"+
    "\0\u2188\0\u21d2\0\u01bc\0\u221c\0\u2266\0\u22b0\0\u22fa\0\u01bc"+
    "\0\u01bc\0\u01bc\0\u2344\0\u238e\0\u01bc\0\u23d8\0\u01bc\0\u2422"+
    "\0\u01bc\0\u01bc";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[186];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\2\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\10"+
    "\1\34\1\35\1\10\1\36\1\37\1\10\1\40\1\41"+
    "\1\10\1\42\1\43\1\10\1\44\1\45\3\10\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
    "\1\57\1\60\1\61\2\10\1\62\1\63\1\64\1\65"+
    "\1\66\1\67\1\70\2\10\1\71\1\72\1\73\1\74"+
    "\1\75\1\76\1\77\1\100\1\5\1\101\1\102\1\103"+
    "\103\101\1\104\2\101\1\105\1\106\1\107\1\110\104\106"+
    "\1\111\2\106\1\112\1\113\1\114\107\112\114\0\1\7"+
    "\113\0\4\10\1\0\1\10\1\0\37\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\13\0\1\115\1\0\1\116"+
    "\1\117\1\120\1\115\1\0\37\115\10\0\1\120\3\0"+
    "\2\115\4\0\2\115\1\0\4\115\20\0\1\121\1\122"+
    "\24\0\1\121\60\0\2\13\1\0\1\121\1\122\24\0"+
    "\1\121\60\0\1\12\1\13\106\0\4\10\1\0\1\10"+
    "\1\0\37\10\14\0\1\10\1\123\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\10\1\0\1\10\1\124"+
    "\35\10\14\0\2\10\4\0\2\10\1\0\4\10\13\0"+
    "\4\10\1\0\1\10\1\0\10\10\1\125\26\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\13\0\4\10\1\0"+
    "\1\10\1\0\12\10\1\126\11\10\1\127\12\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\13\0\4\10\1\0"+
    "\1\10\1\0\1\10\1\130\10\10\1\131\24\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\13\0\4\10\1\0"+
    "\1\10\1\0\5\10\1\132\31\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\13\0\4\10\1\0\1\10\1\0"+
    "\11\10\1\125\25\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\127\1\0\13\10\1\133"+
    "\23\10\14\0\2\10\4\0\2\10\1\0\4\10\13\0"+
    "\4\10\1\0\1\10\1\0\5\10\1\134\5\10\1\131"+
    "\23\10\14\0\2\10\4\0\2\10\1\0\4\10\13\0"+
    "\4\10\1\0\1\10\1\0\27\10\1\135\7\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\13\0\4\10\1\0"+
    "\1\10\1\0\32\10\1\136\4\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\13\0\4\10\1\0\1\10\1\0"+
    "\22\10\1\137\14\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\10\1\0\25\10\1\137"+
    "\11\10\14\0\2\10\4\0\2\10\1\0\4\10\13\0"+
    "\4\10\1\0\1\10\1\0\1\10\1\140\13\10\1\141"+
    "\4\10\1\142\14\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\10\1\0\14\10\1\143"+
    "\7\10\1\144\12\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\10\1\0\5\10\1\145"+
    "\12\10\1\146\4\10\1\147\11\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\13\0\4\10\1\0\1\144\1\0"+
    "\17\10\1\143\17\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\10\1\0\24\10\1\150"+
    "\12\10\14\0\2\10\4\0\2\10\1\0\4\10\13\0"+
    "\4\10\1\0\1\10\1\0\37\10\14\0\1\123\1\10"+
    "\4\0\2\10\1\0\4\10\13\0\4\10\1\0\1\151"+
    "\1\0\37\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\13\0\4\10\1\0\1\10\1\0\2\10\1\152\34\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\14\10\1\153\7\10\1\154\12\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\6\10\1\155\30\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\13\0\4\10\1\0\1\154"+
    "\1\0\17\10\1\153\17\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\67\0\1\156\111\0\1\157\1\0\1\160"+
    "\112\0\1\161\112\0\1\162\105\0\1\163\111\0\1\164"+
    "\35\0\4\10\1\0\1\10\1\0\1\10\1\165\10\10"+
    "\1\166\24\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\13\0\4\10\1\0\1\10\1\0\5\10\1\167\5\10"+
    "\1\170\23\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\13\0\4\10\1\0\1\10\1\0\30\10\1\171\6\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\33\10\1\172\3\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\7\0\1\101\2\0\103\101"+
    "\1\0\2\101\22\0\1\173\10\0\1\174\5\0\1\175"+
    "\45\0\1\176\3\0\1\106\2\0\104\106\1\0\2\106"+
    "\2\0\1\110\111\0\1\114\113\0\4\115\1\0\1\115"+
    "\1\0\37\115\14\0\2\115\4\0\2\115\1\0\4\115"+
    "\15\0\2\117\110\0\1\116\1\117\110\0\1\177\1\200"+
    "\1\201\51\0\1\201\35\0\1\202\1\203\1\0\1\121"+
    "\25\0\1\121\56\0\4\10\1\0\1\10\1\0\2\10"+
    "\1\204\34\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\13\0\4\10\1\0\1\10\1\0\14\10\1\205\22\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\37\10\14\0\2\10\4\0\2\10"+
    "\1\0\1\206\3\10\13\0\4\10\1\0\1\10\1\0"+
    "\6\10\1\207\30\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\10\1\0\17\10\1\210"+
    "\17\10\14\0\2\10\4\0\2\10\1\0\4\10\13\0"+
    "\4\10\1\0\1\10\1\0\37\10\14\0\2\10\4\0"+
    "\2\10\1\0\1\10\1\211\2\10\13\0\4\10\1\0"+
    "\1\10\1\0\30\10\1\212\6\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\13\0\4\10\1\0\1\10\1\0"+
    "\33\10\1\213\3\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\10\1\0\37\10\14\0"+
    "\2\10\4\0\1\214\1\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\22\10\1\215\14\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\13\0\4\10\1\0\1\10"+
    "\1\0\23\10\1\216\13\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\13\0\4\10\1\0\1\10\1\0\37\10"+
    "\14\0\2\10\4\0\1\10\1\217\1\0\4\10\13\0"+
    "\4\10\1\0\1\10\1\0\25\10\1\220\11\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\13\0\4\10\1\0"+
    "\1\10\1\0\26\10\1\221\10\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\13\0\4\10\1\0\1\10\1\0"+
    "\14\10\1\222\22\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\10\1\0\17\10\1\223"+
    "\17\10\14\0\2\10\4\0\2\10\1\0\4\10\13\0"+
    "\4\10\1\0\1\10\1\0\3\10\1\224\33\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\13\0\4\10\1\0"+
    "\1\10\1\0\7\10\1\224\27\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\71\0\1\225\33\0\4\10\1\0"+
    "\1\10\1\0\2\10\1\226\34\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\13\0\4\10\1\0\1\10\1\0"+
    "\3\10\1\227\33\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\10\1\0\6\10\1\230"+
    "\30\10\14\0\2\10\4\0\2\10\1\0\4\10\13\0"+
    "\4\10\1\0\1\10\1\0\7\10\1\227\27\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\13\0\4\10\1\0"+
    "\1\10\1\0\23\10\1\231\13\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\13\0\4\10\1\0\1\10\1\0"+
    "\26\10\1\232\10\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\15\0\2\200\110\0\1\177\1\200\113\0\1\121"+
    "\25\0\1\121\60\0\2\203\1\0\1\121\25\0\1\121"+
    "\56\0\4\10\1\0\1\10\1\0\3\10\1\233\33\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\15\10\1\234\21\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\13\0\4\10\1\0\1\10"+
    "\1\0\1\10\1\235\35\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\13\0\4\10\1\0\1\10\1\0\7\10"+
    "\1\233\27\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\13\0\4\10\1\0\1\10\1\0\20\10\1\236\16\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\5\10\1\237\31\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\13\0\4\10\1\0\1\10"+
    "\1\0\31\10\1\240\5\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\13\0\4\10\1\0\1\10\1\0\34\10"+
    "\1\241\2\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\13\0\4\10\1\0\1\10\1\0\24\10\1\242\12\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\12\10\1\243\24\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\13\0\4\10\1\0\1\10"+
    "\1\0\24\10\1\244\12\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\13\0\4\10\1\0\1\245\1\0\37\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\13\10\1\246\23\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\13\0\4\10\1\0\1\244"+
    "\1\0\37\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\13\0\4\10\1\0\1\10\1\0\23\10\1\247\13\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\26\10\1\250\10\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\13\0\4\10\1\0\1\10"+
    "\1\0\23\10\1\251\13\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\13\0\4\10\1\0\1\10\1\0\26\10"+
    "\1\252\10\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\13\0\4\10\1\0\1\10\1\0\31\10\1\253\5\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\34\10\1\253\2\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\13\0\4\10\1\0\1\10"+
    "\1\0\1\10\1\254\35\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\13\0\4\10\1\0\1\10\1\0\3\10"+
    "\1\255\33\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\13\0\4\10\1\0\1\10\1\0\5\10\1\256\31\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\7\10\1\257\27\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\13\0\4\10\1\0\1\10"+
    "\1\0\24\10\1\260\12\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\13\0\4\10\1\0\1\260\1\0\37\10"+
    "\14\0\2\10\4\0\2\10\1\0\4\10\13\0\4\10"+
    "\1\0\1\10\1\0\31\10\1\261\5\10\14\0\2\10"+
    "\4\0\2\10\1\0\4\10\13\0\4\10\1\0\1\10"+
    "\1\0\35\10\1\262\1\10\14\0\2\10\4\0\2\10"+
    "\1\0\4\10\13\0\4\10\1\0\1\10\1\0\34\10"+
    "\1\261\2\10\14\0\2\10\4\0\2\10\1\0\4\10"+
    "\13\0\4\10\1\0\1\10\1\0\36\10\1\262\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\13\0\4\10\1\0"+
    "\1\10\1\0\22\10\1\263\14\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\13\0\4\10\1\0\1\10\1\0"+
    "\25\10\1\264\11\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\10\1\0\31\10\1\265"+
    "\5\10\14\0\2\10\4\0\2\10\1\0\4\10\13\0"+
    "\4\10\1\0\1\10\1\0\34\10\1\265\2\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\13\0\4\10\1\0"+
    "\1\10\1\0\2\10\1\266\34\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\13\0\4\10\1\0\1\10\1\0"+
    "\24\10\1\267\12\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\10\1\0\6\10\1\270"+
    "\30\10\14\0\2\10\4\0\2\10\1\0\4\10\13\0"+
    "\4\10\1\0\1\267\1\0\37\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\13\0\4\10\1\0\1\10\1\0"+
    "\2\10\1\271\34\10\14\0\2\10\4\0\2\10\1\0"+
    "\4\10\13\0\4\10\1\0\1\10\1\0\6\10\1\271"+
    "\30\10\14\0\2\10\4\0\2\10\1\0\4\10\13\0"+
    "\4\10\1\0\1\10\1\0\16\10\1\272\20\10\14\0"+
    "\2\10\4\0\2\10\1\0\4\10\13\0\4\10\1\0"+
    "\1\10\1\0\21\10\1\272\15\10\14\0\2\10\4\0"+
    "\2\10\1\0\4\10\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9324];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\1\1\1\11\6\1\1\11\27\1\6\11"+
    "\7\1\3\11\2\1\1\11\2\1\6\11\1\1\3\11"+
    "\3\1\3\11\1\1\1\11\1\1\1\11\1\1\2\0"+
    "\34\1\2\11\1\0\4\11\6\1\5\11\1\1\1\0"+
    "\23\1\1\11\45\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[186];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  StringBuffer string = new StringBuffer();

  private int startLine = 0;

  private String file = "";

  public void setStartLine(int startLine)
  {
    this.startLine = startLine;
  }

  public void setFile(String file)
  {
    this.file = file;
  }

  private Symbol symbol(int type) {
    return new PrintableSymbol(type, file, yyline + startLine, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new PrintableSymbol(type, file, yyline + startLine, yycolumn, value);
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ECATokenLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public ECATokenLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 178) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { /* ignore */
          }
        case 59: break;
        case 17: 
          { return symbol(sym.BAND);
          }
        case 60: break;
        case 1: 
          { throw new Error("Illegal character <"+ yytext()+">");
          }
        case 61: break;
        case 8: 
          { return symbol(sym.RPAREN);
          }
        case 62: break;
        case 33: 
          { yybegin(YYINITIAL);
			  return symbol(sym.STRING_LITERAL,
					string.toString());
          }
        case 63: break;
        case 54: 
          { return symbol(sym.BOOLEAN_LITERAL, Boolean.TRUE);
          }
        case 64: break;
        case 32: 
          { throw new Error("Newline in string <"+ yytext()+">");
          }
        case 65: break;
        case 19: 
          { return symbol(sym.GT);
          }
        case 66: break;
        case 50: 
          { string.append('\t');
          }
        case 67: break;
        case 9: 
          { return symbol(sym.LSQUARE);
          }
        case 68: break;
        case 14: 
          { return symbol(sym.LT);
          }
        case 69: break;
        case 27: 
          { string.setLength(0); yybegin(STRING);
          }
        case 70: break;
        case 40: 
          { return symbol(sym.FLOAT_LITERAL, Float.valueOf(yytext()));
          }
        case 71: break;
        case 56: 
          { return symbol(sym.THROW);
          }
        case 72: break;
        case 48: 
          { return symbol(sym.AND);
          }
        case 73: break;
        case 18: 
          { return symbol(sym.NOT);
          }
        case 74: break;
        case 13: 
          { return symbol(sym.ASSIGN);
          }
        case 75: break;
        case 23: 
          { return symbol(sym.DIV);
          }
        case 76: break;
        case 34: 
          { string.append('\\');
          }
        case 77: break;
        case 57: 
          { return symbol(sym.RETURN);
          }
        case 78: break;
        case 51: 
          { string.append('\r');
          }
        case 79: break;
        case 38: 
          { yybegin(YYINITIAL);
          }
        case 80: break;
        case 5: 
          { return symbol(sym.PLUS);
          }
        case 81: break;
        case 24: 
          { return symbol(sym.MOD);
          }
        case 82: break;
        case 31: 
          { throw new Error("Illegal character in string <"+ yytext()+">");
          }
        case 83: break;
        case 35: 
          { throw new Error("Newline in quoted identifier <"+ yytext()+">");
          }
        case 84: break;
        case 29: 
          { yybegin(COMMENT);
          }
        case 85: break;
        case 3: 
          { return symbol(sym.IDENTIFIER, yytext());
          }
        case 86: break;
        case 44: 
          { return symbol(sym.DO);
          }
        case 87: break;
        case 52: 
          { string.append('\"');
          }
        case 88: break;
        case 26: 
          { return symbol(sym.COLON);
          }
        case 89: break;
        case 20: 
          { return symbol(sym.BXOR);
          }
        case 90: break;
        case 42: 
          { return symbol(sym.IF);
          }
        case 91: break;
        case 55: 
          { return symbol(sym.BOOLEAN_LITERAL, Boolean.FALSE);
          }
        case 92: break;
        case 7: 
          { return symbol(sym.LPAREN);
          }
        case 93: break;
        case 45: 
          { return symbol(sym.OR);
          }
        case 94: break;
        case 41: 
          { return symbol(sym.EQ);
          }
        case 95: break;
        case 49: 
          { string.append('\n');
          }
        case 96: break;
        case 11: 
          { return symbol(sym.SEMI);
          }
        case 97: break;
        case 10: 
          { return symbol(sym.RSQUARE);
          }
        case 98: break;
        case 43: 
          { return symbol(sym.NE);
          }
        case 99: break;
        case 15: 
          { return symbol(sym.MINUS);
          }
        case 100: break;
        case 16: 
          { return symbol(sym.BOR);
          }
        case 101: break;
        case 28: 
          { string.setLength(0);  yybegin(QUOTEDIDENT);
          }
        case 102: break;
        case 39: 
          { return symbol(sym.DOLLAR, yytext());
          }
        case 103: break;
        case 21: 
          { return symbol(sym.TWIDDLE);
          }
        case 104: break;
        case 53: 
          { return symbol(sym.BIND);
          }
        case 105: break;
        case 25: 
          { return symbol(sym.TERN_IF);
          }
        case 106: break;
        case 46: 
          { return symbol(sym.GE);
          }
        case 107: break;
        case 36: 
          { yybegin(YYINITIAL);
			  return symbol(sym.IDENTIFIER,
					string.toString());
          }
        case 108: break;
        case 12: 
          { return symbol(sym.COMMA);
          }
        case 109: break;
        case 47: 
          { return symbol(sym.LE);
          }
        case 110: break;
        case 22: 
          { return symbol(sym.MUL);
          }
        case 111: break;
        case 58: 
          { return symbol(sym.NOTHING);
          }
        case 112: break;
        case 4: 
          { return symbol(sym.INTEGER_LITERAL, Integer.valueOf(yytext()));
          }
        case 113: break;
        case 30: 
          { string.append( yytext() );
          }
        case 114: break;
        case 37: 
          { /*ignore */
          }
        case 115: break;
        case 6: 
          { return symbol(sym.DOT);
          }
        case 116: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
