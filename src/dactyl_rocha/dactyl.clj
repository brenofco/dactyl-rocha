(ns dactyl-rocha.dactyl
  (:refer-clojure :exclude [use import])
  (:require [clojure.core.matrix :refer [array matrix mmul]]
            [scad-clj.scad :refer :all]
            [scad-clj.model :refer :all]))

;; degress ;; scad-clj in radians

;; (defn deg2rag [degrees]
;;   (* (/ degrees 180) pi))

;; parameters

;; (def c1-curvature (deg2rad 15))
;; (def c2-curvature (deg2rad 15))
;; (def c3-curvature (deg2rad 15))
;; (def c4-curvature (deg2rad 15))
;; (def c5-curvature (deg2rad 15))
;; (def c6-curvature (deg2rad 15))
;; (def c7-curvature (deg2rad 15))

(def c1-plate-lenght 22)
(def c2-plate-lenght 22)
(def c3-plate-lenght 22)
(def c4-plate-lenght 22)
(def c5-plate-lenght 22)
(def c6-plate-lenght 22)
(def c7-plate-lenght 22)

(def plate-width 20)
(def switch-hole 14)
(def plate-thickness 4.5)
(def switch-hole-r 16)

;; column 1

(def switch-1u
  (difference
   (cube c1-plate-lenght plate-width plate-thickness) 
    (union
     (cube switch-hole switch-hole 5)
     (->> (cube switch-hole-r 5 6)
          (translate [0 0 -2.25])))))

(def model-left
  (union
   switch-1u
   (->> switch-1u
        (translate [22 0 0])
        (rotate [1 1 1]))
   (->> switch-1u
        (translate [44 0 0]))
   (->> switch-1u
        (translate [-22 0 0]))
   (->> switch-1u
        (translate [-44 0 0]))))


   
;; export

(spit "things/left.scad"
      (write-scad model-left))

;; 