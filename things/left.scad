union () {
  difference () {
    cube ([22, 20, 4.5], center=true);
    union () {
      cube ([14, 14, 5], center=true);
      translate ([0, 0, -2.25]) {
        cube ([16, 5, 6], center=true);
      }
    }
  }
  rotate ([57.29577951308232,57.29577951308232,57.29577951308232]) {
    translate ([22, 0, 0]) {
      difference () {
        cube ([22, 20, 4.5], center=true);
        union () {
          cube ([14, 14, 5], center=true);
          translate ([0, 0, -2.25]) {
            cube ([16, 5, 6], center=true);
          }
        }
      }
    }
  }
  translate ([44, 0, 0]) {
    difference () {
      cube ([22, 20, 4.5], center=true);
      union () {
        cube ([14, 14, 5], center=true);
        translate ([0, 0, -2.25]) {
          cube ([16, 5, 6], center=true);
        }
      }
    }
  }
  translate ([-22, 0, 0]) {
    difference () {
      cube ([22, 20, 4.5], center=true);
      union () {
        cube ([14, 14, 5], center=true);
        translate ([0, 0, -2.25]) {
          cube ([16, 5, 6], center=true);
        }
      }
    }
  }
  translate ([-44, 0, 0]) {
    difference () {
      cube ([22, 20, 4.5], center=true);
      union () {
        cube ([14, 14, 5], center=true);
        translate ([0, 0, -2.25]) {
          cube ([16, 5, 6], center=true);
        }
      }
    }
  }
}
