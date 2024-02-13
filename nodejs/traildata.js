// Grab data file
const trails = require('./trails.json');

const util = require('util');

const getTrailDistance = (trail, callback) => {
  return setTimeout(() => {
    if (trails.hasOwnProperty(trail)) {    
      const foundTrail = trails[trail];    
      callback(null, foundTrail)
    } else {
      callback(new Error('Trail not found!'))
    }
  }, 1000);
}
// Build promise
const getTrailDistancePromise = util.promisify(getTrailDistance);

// Do the thing (expected vs. error)
getTrailDistancePromise('North Country')
  .then((foundTrail) => {      
    console.log(`The ${foundTrail.nickname
    } is ${foundTrail.miles
    } miles long!`);
})
  .catch((error) => {
    console.log('Trail not found!', error);
})