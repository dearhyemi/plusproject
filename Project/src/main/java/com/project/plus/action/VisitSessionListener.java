package com.project.plus.action;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.plus.service.VisitCountService;

@Component
public class VisitSessionListener implements HttpSessionListener {
// λ°©λ¬Έ??λ₯? κ³μ°?? ?΄??€

	@Override
	public void sessionCreated(HttpSessionEvent sessionEve) {
		System.out.println("?Έ? ?¬λ¦¬μ?΄?°? ? ?");
		// ?Έ??΄ ?λ‘? ??±?λ©? execute() ?€???€.
		if (sessionEve.getSession().isNew()) {
			System.out.println("?Έ??€????");
			execute(sessionEve);
		}
	}

	@Autowired
	VisitCountService vcs;

	int total = 0;
	int today = 0;

	private void execute(HttpSessionEvent sessionEve) {
		// VisitCountController cntr = VisitCountController.getInstance();
		System.out.println("execute ?€?????");
		total = vcs.getTotalCount();
		today = vcs.getTodayCount();

		try {

			System.out.println(total);
			System.out.println(today);
			HttpSession session = sessionEve.getSession();

//	            // ?Έ?? λ°©λ¬Έ? ?λ₯? ?΄??€.
			session.setAttribute("total", total);
			session.setAttribute("today", today);

		} catch (Exception e) {
			System.out.println("===== λ°©λ¬Έ? μΉ΄μ΄?° ?€λ₯? =====\n");
			e.printStackTrace();
		}
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
	}

}
