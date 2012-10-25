# clj-x256

[![Build Status](https://secure.travis-ci.org/john2x/clj-x256.png?branch=master)](http://travis-ci.org/john2x/clj-x256)

*This is a clojure version from [python-x256](https://github.com/magarcia/python-x256)*

Return the nearest
[xterm 256 color code](http://www.frexx.de/xterm-256-notes/)
for rgb inputs.

## Install

Available at [clojars.org](https://clojars.org/clj-x256).

### Leiningen

Add the following in your `project.clj` `:dependencies`:

    [clj-x256 "0.0.1"]

## Usage

Example:

	user=> (use 'clj-x256.x256)
	nil
	user=> (from-rgb 220 40 150)
	162

### Methods

##### clj-x256.x256/from-rgb
`[[red green blue]], [red green blue]`

Return the nearest xterm 256 color code for the 24-bit `[red, green, blue]`
values.

`red`, `green`, and `blue` should each be integers from 0 through 255,
inclusive.


##### clj-x256.x256/from-hex
`[hex]`

Return the nearest xterm 256 color code for the hexadecimal color
values.

`hex` should be string without 0x.

##### clj-x256.x256/to-rgb
`[ix]`

Return 24-bit `[red, green, blue]` values from xterm 256 color code.

`ix` should be integer.

##### clj-x256.x256/to-hex
`[ix]`

Return hexadecimal color from xterm 256 color code.

`ix` should be integer.

## License

Copyright © 2012 John Louis Del Rosario

Distributed under the MIT License.
