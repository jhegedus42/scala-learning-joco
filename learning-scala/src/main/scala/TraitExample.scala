// In this trait we simulate a Wankel engine (alternative to piston engines).
// https://www.youtube.com/watch?v=pCteBhr4dGY

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
