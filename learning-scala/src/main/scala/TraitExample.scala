// In this trait we simulate a Wankel engine (alternative to piston engines).

trait WankelServer { 
  def route: Route
  // start the server, configure ports, etc., requires a route
  def startHttpServer = …
}

object WankelServiceApp extends WankelServer with WankelService with Directives {
  // perse and validate command line, start server
  startHttpServer
}

trait WankelService {
  def route: Route = …..
}
