package co.edu.uniandes.archid.csharp.util;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * A collection of Util functions
 */
public class Util {
	/**
	 * Get the first token with a given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static Token getFirstTokenWithType(final List<Token> tokens, final int tokenType) {
		for (final Token token: tokens) {
			if (token.getType() == tokenType) {
                return token;
            }
		}
		return null;
	}
	
	/**
	 * Get the first token with a given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static Token getFirstTokenWithType(final List<Token> tokens, final int[] tokenTypes) {
		for (final Token token: tokens) {
			for (final int type : tokenTypes) {
				if (token.getType() == type) {
	                return token;
	            }
			}
		}
		return null;
	}
	
	/**
	 * Get the tokens with a given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static List<Token> getTokensWithType(final List<Token> tokens, final int tokenType) {
		List<Token> tokensType = new ArrayList<>();
		for (final Token token: tokens) {
			if (token.getType() == tokenType) {
                tokensType.add(token);
            }
		}
		return tokensType;
	}
	
	/**
	 * Get the last index of a token with a given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static int getLastTokenIndex(final List<Token> tokens, final int tokenType, final int untiTokenType) {
		int index = -1;
		for(int i = 0; i < tokens.size(); i++) {
			if(tokens.get(i).getType() == tokenType) {
				index = i;
			}
			if(tokens.get(i).getType() == untiTokenType) {
				break;
			}
		}
		return index;
	}
	
	/**
	 * Get the tokens with a given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static List<Token> getTokensFromIndex(final List<Token> tokens, final int index) {
		List<Token> tokensType = new ArrayList<>();
		for(int i = index; i < tokens.size(); i++) {
			tokensType.add(tokens.get(i));
			
		}
		return tokensType;
	}
	
	/**
	 * Get the list of Lists of tokens with a begin token and a final token 
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static List<List<Token>> getTokensByRange(final List<Token> tokens, final int beginTokenType, final int endTokenType) {
		List<List<Token>> tokensByType = new ArrayList<List<Token>>();
		List<Token> part = null;
		boolean add = false;
		for (final Token token: tokens) {
			if (token.getType() == beginTokenType) {
				part = new ArrayList<Token>();
				part.add(token);
                add = true;
            } else if(add) {
            	part.add(token);
            } else if (token.getType() == endTokenType) {
				part.add(token);
				tokensByType.add(part);
				add = false;
            }
		}
		return tokensByType;
	}
	
	/**
	 * Get the token before the one with the given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static Token getTokenBeforeType(final List<Token> tokens, final int tokenType) {
		Token previousToken = null;
		for (final Token token: tokens) {
			if (token.getType() == tokenType) {
				return previousToken;
            }
			previousToken = token;
		}
		return previousToken;
	}
	
	/**
	 * Get the tokens before the one with the given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static List<Token> getTokensBeforeType(final List<Token> tokens, final int tokenType) {
		List<Token> previousTokens = new ArrayList<>();
		for (final Token token: tokens) {
			if (token.getType() == tokenType) {
				return previousTokens;
            }
			previousTokens.add(token);
		}
		return null;
	}
	
	/**
	 * Get the token after the one with the given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static Token getTokenAfterType(final List<Token> tokens, final int tokenType) {
		Boolean isNext = false;
		for (final Token token: tokens) {
			if (isNext) {
				return token;
			}
			if (token.getType() == tokenType) {
				isNext = true;
            }
		}
		return null;
	}
	
	/**
	 * Get the second token with the given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static Token getSecondTokenWithType(final List<Token> tokens, final int tokenType) {
		int count = 0;
		for (final Token token: tokens) {
			if (token.getType() == tokenType) {
				count++;
            }
			if(count == 2) {
				return token;
			}
		}
		return null;
	}
	
	/**
	 * Get the last token with the given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static Token getLastTokenWithType(final List<Token> tokens, final int tokenType) {
		Token lastToken = null;
		for (final Token token: tokens) {
			if (token.getType() == tokenType) {
				lastToken = token;
            }
		}
		return lastToken;
	}
	
	/**
	 * Get the token after the one with the given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static List<Token> getTokensAfterType(final List<Token> tokens, final int tokenType) {
		Boolean isNext = false;
		List<Token> tokensType = new ArrayList<>();
		for (Token token: tokens) {
			if (isNext) {
				tokensType.add(token);
			}
			if (token.getType() == tokenType) {
				isNext = true;
            }
		}
		return tokensType;
	}
	
	/**
	 * Get the token after the one with the given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static List<Token> getTokensFromLine(final List<Token> tokens, final int line) {
		List<Token> tokensLine = new ArrayList<>();
		for (Token token: tokens) {
			if (token.getLine() == line) {
				tokensLine.add(token);
			}
		}
		return tokensLine;
	}
	
	/**
	 * Get the first token with a given type
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static Boolean tokenExists(final List<Token> tokens, final int tokenType) {
		for (Token token: tokens) {
			if (token.getType() == tokenType) {
                return true;
            }
		}
		return false;
	}
	
	/**
	 * Get the tokens between openingType and closingType
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static List<Token> getTokensBetween(final List<Token> tokens, final int openingType, final int closingType) {
		List<Token> tokensReturn = new ArrayList<Token>();
		Boolean opened = false;
		for (Token token: tokens) {
			if (token.getType() == closingType) {
				break;
            }
			
			if (opened) {
				tokensReturn.add(token);
			}
			
			if (token.getType() == openingType) {
				opened = true;
            }
		}
		return tokensReturn;
	}
	
	/**
	 * Remove the tokens between openingType and closingType
	 * @param tokens
	 * @param tokenType
	 * @return
	 */
	public static List<Token> removeTokensBetween(final List<Token> tokens, final int openingType, final int closingType) {
		List<Token> tokensReturn = new ArrayList<Token>();
		Boolean add = true;
		for (Token token: tokens) {
			if (token.getType() == openingType) {
				add = false;
            }
			if (add) {
				tokensReturn.add(token);
			}
			
			if (token.getType() == closingType) {
				add = true;
            }
		}
		return tokensReturn;
	}
	
	/**
	 * Extract tokens from a flat list to a list of list
	 * For methods for example, extract "int a, int b" to 2 lists: "int a" and "int b"
	 * @param tokens
	 * @param separator int separator between two sublists, comma for methods
	 * @return list of list
	 */
	public static ArrayList<ArrayList<Token>> getTokensSublist(final List<Token> tokens, final int separator) {
		ArrayList<ArrayList<Token>> tokensReturn = new ArrayList<ArrayList<Token>>();
		ArrayList<Token> sublist = new ArrayList<Token>();
		for (Token token: tokens) {
			if (token.getType() == separator) {
				tokensReturn.add(sublist);
				sublist = new ArrayList<Token>();
            } else {
            	sublist.add(token);
            }
		}
		tokensReturn.add(sublist);
		return tokensReturn;
	}
	
	public static Token getToken(final ParseTree node) {
		Token token = null;
		if (node instanceof ParserRuleContext) {
		    token = ((ParserRuleContext) node).getStart(); // or #getStop
		} else if (node instanceof TerminalNode) {        // TerminalNodeImpl or ErrorNode
		    token = ((TerminalNode) node).getSymbol();
		}
		return token;
	}
	
	/**
	 * Get the type of the token
	 * @param node
	 * @return
	 */
	public static int getType(final ParseTree node) {
		return Util.getToken(node).getType();
	}
	
	/**
	 * Retrieves all Tokens from the {@code tree} in an in-order sequence.
	 *
	 * @param tree
	 *         the parse tee to get all tokens from.
	 *
	 * @return all Tokens from the {@code tree} in an in-order sequence.
	 * https://stackoverflow.com/questions/22769343/antlr4-flattening-a-parserrulecontext-tree-into-an-array
	 */
	public static List<Token> getFlatTokenList(final ParseTree tree) {
	    List<Token> tokens = new ArrayList<Token>();
	    Util.inOrderTraversal(tokens, tree);
	    return tokens;
	}

	/**
	 * Makes an in-order traversal over {@code parent} (recursively) collecting
	 * all Tokens of the terminal nodes it encounters.
	 *
	 * @param tokens
	 *         the list of tokens.
	 * @param parent
	 *         the current parent node to inspect for terminal nodes.
	 */
	private static void inOrderTraversal(final List<Token> tokens, final ParseTree parent) {

	    // Iterate over all child nodes of `parent`.
	    for (int i = 0; i < parent.getChildCount(); i++) {

	        // Get the i-th child node of `parent`.
	    	final ParseTree child = parent.getChild(i);

	        if (child instanceof TerminalNode) {
	            // We found a leaf/terminal, add its Token to our list.
	            TerminalNode node = (TerminalNode) child;
	            tokens.add(node.getSymbol());
	        }
	        else {
	            // No leaf/terminal node, recursively call this method.
	            inOrderTraversal(tokens, child);
	        }
	    }
	}
}
