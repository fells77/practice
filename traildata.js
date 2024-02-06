// Require in trails module from trails.js
const trails = require('./trails.js');
// Require util module here!
const util = require('util');

// Simulate database call to search trails module for specified trail
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
// Promisfy below!
const getTrailDistancePromise = util.promisify(getTrailDistance);

getTrailDistancePromise('North Country')
  .then((foundTrail) => {      
    console.log(`The ${foundTrail.nickname
    } is ${foundTrail.miles
    } miles long!01`);
})
  .catch((error) => {
    console.log('Trail not found!', error);
})