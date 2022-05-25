package com.arcode.eamovies.utils.constants.extensions

import android.content.Context
import android.widget.Toast

/**
 * Show a toast message
 */
fun Context.showToast(message: String) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()