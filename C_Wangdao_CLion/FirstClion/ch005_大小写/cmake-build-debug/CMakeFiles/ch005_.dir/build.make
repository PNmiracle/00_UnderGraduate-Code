# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.20

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "E:\CLion\CLion 2021.2.3\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "E:\CLion\CLion 2021.2.3\bin\cmake\win\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\数据类型与字符型\ch005_大小写

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\数据类型与字符型\ch005_大小写\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/ch005_.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/ch005_.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/ch005_.dir/flags.make

CMakeFiles/ch005_.dir/library.c.obj: CMakeFiles/ch005_.dir/flags.make
CMakeFiles/ch005_.dir/library.c.obj: ../library.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\数据类型与字符型\ch005_大小写\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/ch005_.dir/library.c.obj"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles\ch005_.dir\library.c.obj -c D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\数据类型与字符型\ch005_大小写\library.c

CMakeFiles/ch005_.dir/library.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/ch005_.dir/library.c.i"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\数据类型与字符型\ch005_大小写\library.c > CMakeFiles\ch005_.dir\library.c.i

CMakeFiles/ch005_.dir/library.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/ch005_.dir/library.c.s"
	D:\adeveloperTools\MinGW\MinGW\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\数据类型与字符型\ch005_大小写\library.c -o CMakeFiles\ch005_.dir\library.c.s

# Object files for target ch005_
ch005__OBJECTS = \
"CMakeFiles/ch005_.dir/library.c.obj"

# External object files for target ch005_
ch005__EXTERNAL_OBJECTS =

libch005_.a: CMakeFiles/ch005_.dir/library.c.obj
libch005_.a: CMakeFiles/ch005_.dir/build.make
libch005_.a: CMakeFiles/ch005_.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\数据类型与字符型\ch005_大小写\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C static library libch005_.a"
	$(CMAKE_COMMAND) -P CMakeFiles\ch005_.dir\cmake_clean_target.cmake
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\ch005_.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/ch005_.dir/build: libch005_.a
.PHONY : CMakeFiles/ch005_.dir/build

CMakeFiles/ch005_.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\ch005_.dir\cmake_clean.cmake
.PHONY : CMakeFiles/ch005_.dir/clean

CMakeFiles/ch005_.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\数据类型与字符型\ch005_大小写 D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\数据类型与字符型\ch005_大小写 D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\数据类型与字符型\ch005_大小写\cmake-build-debug D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\数据类型与字符型\ch005_大小写\cmake-build-debug D:\00_UnderGraduate-Code\HomeWork\C_Wangdao_CLion\数据类型与字符型\ch005_大小写\cmake-build-debug\CMakeFiles\ch005_.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/ch005_.dir/depend

