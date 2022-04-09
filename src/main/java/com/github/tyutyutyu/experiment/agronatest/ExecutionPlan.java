package com.github.tyutyutyu.experiment.agronatest;

import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class ExecutionPlan {

	@Param({"1000", "10000", "100000", "1000000"})
	public int iterations;

}
