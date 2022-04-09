package com.github.tyutyutyu.experiment.agronatest;

import org.agrona.collections.IntArrayList;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

import java.util.ArrayList;
import java.util.List;

public class ListAddBenchmark {

	@Benchmark
	@BenchmarkMode(Mode.Throughput)
	@Fork(value = 1, warmups = 2)
	public void javaUtilArrayList(ExecutionPlan executionPlan) {
		List<Integer> integerList = new ArrayList<>();
		add(integerList, executionPlan.iterations);
	}

	@Benchmark
	@BenchmarkMode(Mode.Throughput)
	@Fork(value = 1, warmups = 2)
	public void agronaIntArrayList(ExecutionPlan executionPlan) {
		List<Integer> integerList = new IntArrayList();
		add(integerList, executionPlan.iterations);
	}

	private static void add(List<Integer> integerList, int iterations) {
		for (int i = 0; i < iterations; i++) {
			integerList.add(1);
		}
	}

}
