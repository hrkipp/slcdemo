package ffm.slc.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import ffm.slc.auth.LoginServlet;
import ffm.slc.auth.LogoutServlet;
import ffm.slc.dispatch.DispatchServlet;

public class GuiceServletConfig extends GuiceServletContextListener {

  @Override
  protected Injector getInjector() {
    return Guice.createInjector(new HandlerModule(), new ServletModule(){
        @Override
        protected void configureServlets() {
            serve("/dispatch").with(DispatchServlet.class);
			serve("/login").with(LoginServlet.class);
			serve("/logout").with(LogoutServlet.class);
        }
    });
  }

}