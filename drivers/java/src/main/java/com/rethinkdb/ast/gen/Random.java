// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class Random extends ReqlQuery {


    public Random(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Random(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Random(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.RANDOM, args, optargs);
    }
    protected Random(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Random fromArgs(java.lang.Object... args){
        return new Random(new Arguments(args), null);
    }


}