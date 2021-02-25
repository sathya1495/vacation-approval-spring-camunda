package com.insurance.project;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PrintPlan implements JavaDelegate {
	private final Logger LOGGER = Logger.getLogger(PrintPlan.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("\n\n  ... Logger invoked by "
	+ " ,processDefinitonId" +execution.getProcessDefinitionId()
	+ " ,activityId" +execution.getCurrentActivityId()
	+ " ,activityName" +execution.getCurrentActivityName()
	+ " ,processInstanceId" +execution.getProcessInstanceId()
	+ " ,businessKey" +execution.getProcessBusinessKey()
	+ " ,executionId" +execution.getId()
	+ " \n\n"
	);
	}

}
