if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'KruzoJS'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'KruzoJS'.");
}
var KruzoJS = function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  function main(args) {
    println('ss');
  }
  _.main_kand9s$ = main;
  Kotlin.defineModule('KruzoJS', _);
  main([]);
  return _;
}(typeof KruzoJS === 'undefined' ? {} : KruzoJS, kotlin);
