package com.apress.messaging.listener;

import com.apress.messaging.event.CurrencyConversionEvent;
import com.apress.messaging.event.CurrencyEvent;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.apress.messaging.annotation.Log;

@Component
public class RestAppEventListener {

	//@EventListener(condition = "#springApp.args.length > 1")
	//@EventListener({CurrencyEvent.class,CurrencyConversionEvent.class})
	//@Order(Ordered.HIGHEST_PRECEDENCE)
	@Async
	@EventListener
	@Log(printParamsValues=true)
	public void restAppHandler1(SpringApplicationEvent springApp){
	}

	@EventListener
	@Log(printParamsValues=true)
	@Async
	public void restAppHandler2(SpringApplicationEvent springApp){
	}

	@EventListener(classes = {CurrencyConversionEvent.class, CurrencyEvent.class})
	@Log(printParamsValues=true)
	@Async
	public void restAppHandler3(){
	}
}
