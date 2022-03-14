import { ReactComponent as GithubIcon } from "assets/img/Github.svg";
import './styles.css'

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="ghmovie-nav-content">
          <h1>GhMovie</h1>
          <a href="https://github.com/GhaSilva">
            <div className="ghmovie-contact-container">
              <GithubIcon />
              <p className="ghmovies-contact-link">/GhaSilva</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
