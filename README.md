## minimized bug

### Reproduce

```
sbt
> compile
[ change crash2.scala ]
> compile
[ crash ]
```

Log:
```
[info] Set current project to dotty-simple (in build file:/Users/pgiarrusso/git/bug/)
[info] sbt server started at local:///Users/pgiarrusso/.sbt/1.0/server/be40d98bc276f94f637c/sock
sbt:dotty-simple> compile
[info] Compiling 2 Scala sources to /Users/pgiarrusso/git/bug/target/scala-0.21/classes ...
[success] Total time: 4 s, completed Dec 10, 2019 6:19:49 PM
sbt:dotty-simple> compile
[info] Compiling 1 Scala source to /Users/pgiarrusso/git/bug/target/scala-0.21/classes ...
[info] exception occurred while typechecking /Users/pgiarrusso/git/bug/src/main/scala/crash2.scala
[info] exception occurred while compiling /Users/pgiarrusso/git/bug/src/main/scala/crash2.scala
java.lang.AssertionError: assertion failed: owner discrepancy for type IFTA, expected: class <refinement>, found: class <refinement> while compiling /Users/pgiarrusso/git/bug/src/main/scala/crash2.scala
[error] ## Exception when compiling 2 sources to /Users/pgiarrusso/git/bug/target/scala-0.21/classes
[error] java.lang.AssertionError: assertion failed: owner discrepancy for type IFTA, expected: class <refinement>, found: class <refinement>
[error] dotty.DottyPredef$.assertFail(DottyPredef.scala:17)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.symbolAtCurrent(TreeUnpickler.scala:240)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.indexStats(TreeUnpickler.scala:680)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readStats(TreeUnpickler.scala:989)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readLengthTerm$1(TreeUnpickler.scala:1173)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readTerm(TreeUnpickler.scala:1210)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readTpt(TreeUnpickler.scala:1237)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readTpt(TreeUnpickler.scala:1223)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readNewDef(TreeUnpickler.scala:837)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readIndexedDef(TreeUnpickler.scala:743)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readIndexedParams$$anonfun$2(TreeUnpickler.scala:994)
[error] dotty.tools.tasty.TastyReader.collectWhile(TastyReader.scala:137)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readIndexedParams(TreeUnpickler.scala:994)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readParams(TreeUnpickler.scala:999)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readParamss$1(TreeUnpickler.scala:758)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readNewDef(TreeUnpickler.scala:794)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readIndexedDef(TreeUnpickler.scala:743)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readIndexedStat(TreeUnpickler.scala:938)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readIndexedStats$$anonfun$1(TreeUnpickler.scala:986)
[error] dotty.tools.tasty.TastyReader.until(TastyReader.scala:125)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readIndexedStats(TreeUnpickler.scala:986)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readStats(TreeUnpickler.scala:990)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readLengthTerm$1(TreeUnpickler.scala:1173)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readTerm(TreeUnpickler.scala:1210)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readTpt(TreeUnpickler.scala:1237)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readNewDef(TreeUnpickler.scala:823)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$TreeReader.readIndexedDef(TreeUnpickler.scala:743)
[error] dotty.tools.dotc.core.tasty.TreeUnpickler$Completer.complete(TreeUnpickler.scala:119)
[error] dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:257)
[error] dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:182)
[error] dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:184)
[error] dotty.tools.dotc.core.Types$NamedType.info(Types.scala:1904)
[error] dotty.tools.dotc.core.Types$Type.dealias1(Types.scala:1158)
[error] dotty.tools.dotc.core.Types$Type.dealias(Types.scala:1181)
[error] dotty.tools.dotc.core.Types$Type.underlyingClassRef(Types.scala:1244)
[error] dotty.tools.dotc.typer.Typer.isImplicitFunctionRef$1(Typer.scala:2762)
[error] dotty.tools.dotc.typer.Typer.adaptNoArgsOther$6(Typer.scala:2768)
[error] dotty.tools.dotc.typer.Typer.adaptNoArgs$1(Typer.scala:2885)
[error] dotty.tools.dotc.typer.Typer.adapt1(Typer.scala:3091)
[error] dotty.tools.dotc.typer.Typer.adapt(Typer.scala:2497)
[error] dotty.tools.dotc.typer.Typer.typed(Typer.scala:2189)
[error] dotty.tools.dotc.typer.Typer.typed(Typer.scala:2201)
[error] dotty.tools.dotc.typer.Namer.typedAheadExpr$$anonfun$1(Namer.scala:1236)
[error] dotty.tools.dotc.typer.Namer.typedAhead(Namer.scala:1226)
[error] dotty.tools.dotc.typer.Namer.typedAheadExpr(Namer.scala:1236)
[error] dotty.tools.dotc.typer.Namer.rhsType$2(Namer.scala:1370)
[error] dotty.tools.dotc.typer.Namer.cookedRhsType$1(Namer.scala:1381)
[error] dotty.tools.dotc.typer.Namer.lhsType$1(Namer.scala:1382)
[error] dotty.tools.dotc.typer.Namer.inferredType$1(Namer.scala:1393)
[error] dotty.tools.dotc.typer.Namer.valOrDefDefSig(Namer.scala:1401)
[error] dotty.tools.dotc.typer.Namer$Completer.typeSig(Namer.scala:784)
[error] dotty.tools.dotc.typer.Namer$Completer.completeInCreationContext(Namer.scala:908)
[error] dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:816)
[error] dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:257)
[error] dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:182)
[error] dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:184)
[error] dotty.tools.dotc.core.SymDenotations$SymDenotation.ensureCompleted(SymDenotations.scala:397)
[error] dotty.tools.dotc.typer.Typer.retrieveSym(Typer.scala:2047)
[error] dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:2072)
[error] dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:2152)
[error] dotty.tools.dotc.typer.Typer.typed(Typer.scala:2189)
[error] dotty.tools.dotc.typer.Typer.typed(Typer.scala:2201)
[error] dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:2228)
[error] dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:2272)
[error] dotty.tools.dotc.typer.Typer.typedClassDef(Typer.scala:1767)
[error] dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:2085)
[error] dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:2152)
[error] dotty.tools.dotc.typer.Typer.typed(Typer.scala:2189)
[error] dotty.tools.dotc.typer.Typer.typed(Typer.scala:2201)
[error] dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:2228)
[error] dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:2272)
[error] dotty.tools.dotc.typer.Typer.typedPackageDef(Typer.scala:1887)
[error] dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:2126)
[error] dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:2153)
[error] dotty.tools.dotc.typer.Typer.typed(Typer.scala:2189)
[error] dotty.tools.dotc.typer.Typer.typed(Typer.scala:2201)
[error] dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:2286)
[error] dotty.tools.dotc.typer.FrontEnd.liftedTree1$2(FrontEnd.scala:78)
[error] dotty.tools.dotc.typer.FrontEnd.typeCheck$$anonfun$1(FrontEnd.scala:83)
[error] dotty.runtime.function.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:12)
[error] dotty.tools.dotc.typer.FrontEnd.monitor(FrontEnd.scala:42)
[error] dotty.tools.dotc.typer.FrontEnd.typeCheck(FrontEnd.scala:84)
[error] dotty.tools.dotc.typer.FrontEnd.runOn$$anonfun$3(FrontEnd.scala:114)
[error] dotty.runtime.function.JProcedure1.apply(JProcedure1.java:15)
[error] dotty.runtime.function.JProcedure1.apply(JProcedure1.java:10)
[error] scala.collection.immutable.List.foreach(List.scala:305)
[error] dotty.tools.dotc.typer.FrontEnd.runOn(FrontEnd.scala:114)
[error] dotty.tools.dotc.Run.runPhases$4$$anonfun$4(Run.scala:161)
[error] dotty.runtime.function.JProcedure1.apply(JProcedure1.java:15)
[error] dotty.runtime.function.JProcedure1.apply(JProcedure1.java:10)
[error] scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1323)
[error] dotty.tools.dotc.Run.runPhases$5(Run.scala:171)
[error] dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:179)
[error] dotty.runtime.function.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:12)
[error] dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:65)
[error] dotty.tools.dotc.Run.compileUnits(Run.scala:186)
[error] dotty.tools.dotc.Run.compileSources(Run.scala:123)
[error] dotty.tools.dotc.Run.compile(Run.scala:106)
[error] dotty.tools.dotc.Driver.doCompile(Driver.scala:36)
[error] dotty.tools.dotc.Driver.process(Driver.scala:189)
[error] dotty.tools.dotc.Main.process(Main.scala)
[error] xsbt.CachedCompilerImpl.run(CachedCompilerImpl.java:69)
[error] xsbt.CompilerInterface.run(CompilerInterface.java:41)
[error] sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[error] sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[error] sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[error] java.lang.reflect.Method.invoke(Method.java:498)
[error] sbt.internal.inc.AnalyzingCompiler.call(AnalyzingCompiler.scala:248)
[error] sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:122)
[error] sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:95)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4(MixedAnalyzingCompiler.scala:91)
[error] scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
[error] sbt.internal.inc.MixedAnalyzingCompiler.timed(MixedAnalyzingCompiler.scala:186)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$3(MixedAnalyzingCompiler.scala:82)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$3$adapted(MixedAnalyzingCompiler.scala:77)
[error] sbt.internal.inc.JarUtils$.withPreviousJar(JarUtils.scala:215)
[error] sbt.internal.inc.MixedAnalyzingCompiler.compileScala$1(MixedAnalyzingCompiler.scala:77)
[error] sbt.internal.inc.MixedAnalyzingCompiler.compile(MixedAnalyzingCompiler.scala:146)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1(IncrementalCompilerImpl.scala:343)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1$adapted(IncrementalCompilerImpl.scala:343)
[error] sbt.internal.inc.Incremental$.doCompile(Incremental.scala:120)
[error] sbt.internal.inc.Incremental$.$anonfun$compile$4(Incremental.scala:100)
[error] sbt.internal.inc.IncrementalCommon.recompileClasses(IncrementalCommon.scala:180)
[error] sbt.internal.inc.IncrementalCommon.cycle(IncrementalCommon.scala:98)
[error] sbt.internal.inc.Incremental$.$anonfun$compile$3(Incremental.scala:102)
[error] sbt.internal.inc.Incremental$.manageClassfiles(Incremental.scala:155)
[error] sbt.internal.inc.Incremental$.compile(Incremental.scala:92)
[error] sbt.internal.inc.IncrementalCompile$.apply(Compile.scala:75)
[error] sbt.internal.inc.IncrementalCompilerImpl.compileInternal(IncrementalCompilerImpl.scala:348)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileIncrementally$1(IncrementalCompilerImpl.scala:301)
[error] sbt.internal.inc.IncrementalCompilerImpl.handleCompilationError(IncrementalCompilerImpl.scala:168)
[error] sbt.internal.inc.IncrementalCompilerImpl.compileIncrementally(IncrementalCompilerImpl.scala:248)
[error] sbt.internal.inc.IncrementalCompilerImpl.compile(IncrementalCompilerImpl.scala:74)
[error] sbt.Defaults$.compileIncrementalTaskImpl(Defaults.scala:1761)
[error] sbt.Defaults$.$anonfun$compileIncrementalTask$1(Defaults.scala:1734)
[error] scala.Function1.$anonfun$compose$1(Function1.scala:49)
[error] sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:62)
[error] sbt.std.Transform$$anon$4.work(Transform.scala:67)
[error] sbt.Execute.$anonfun$submit$2(Execute.scala:281)
[error] sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:19)
[error] sbt.Execute.work(Execute.scala:290)
[error] sbt.Execute.$anonfun$submit$1(Execute.scala:281)
[error] sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:178)
[error] sbt.CompletionService$$anon$2.call(CompletionService.scala:37)
[error] java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error] java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[error] java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[error] java.lang.Thread.run(Thread.java:748)
[error]
[error] stack trace is suppressed; run last Compile / compileIncremental for the full output
[error] (Compile / compileIncremental) java.lang.AssertionError: assertion failed: owner discrepancy for type IFTA, expected: class <refinement>, found: class <refinement>
[error] Total time: 0 s, completed Dec 10, 2019 6:20:05 PM
sbt:dotty-simple>
```

### Usage

This is a normal sbt project, you can compile code with `sbt compile` and run it
with `sbt run`, `sbt console` will start a Dotty REPL.

For more information on the sbt-dotty plugin, see the
[dotty-example-project](https://github.com/lampepfl/dotty-example-project/blob/master/README.md).
