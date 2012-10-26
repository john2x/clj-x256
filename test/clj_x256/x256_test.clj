(ns clj-x256.x256-test
  (:use clojure.test
        clj-x256.x256))

(deftest x256-tests
  (let [rgb [220 40 150]
        xcolor 162
        hex "dC2896"
        aprox-hex "d70087"
        aprox-rgb [215 0 135]]
    (testing "from-rgb"
      (is (= (from-rgb rgb)
             xcolor))
      (is (= (from-rgb (rgb 0) (rgb 1) (rgb 2))
             xcolor)))
    (testing "from-hex"
      (is (= (from-hex hex)
             xcolor)))
    (testing "to-rgb"
      (is (= (to-rgb xcolor)
             aprox-rgb)))
    (testing "to-hex"
      (is (= (to-hex xcolor)
             aprox-hex)))
    ))
