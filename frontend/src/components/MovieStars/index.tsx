import { ReactComponent as StarFull} from 'assets/img/Star-full.svg';
import { ReactComponent as StarHalf} from 'assets/img/Star-half.svg';
import { ReactComponent as StarEmpty} from 'assets/img/Star-empty.svg';
import './styles.css';


function MovieStars() {
  return (
    <div className="dsmovie-stars-container">
      <StarFull />
      <StarFull />
      <StarFull />
      <StarHalf />
      <StarEmpty />
    </div>
  );
}

export default MovieStars;
